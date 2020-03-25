package com.moko.sw_ev.sw_emergency_version.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.moko.sw_ev.sw_emergency_version.model.User;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

	private static List<User> listAllUsers = new ArrayList<>();
	
	@Override
	public int insertUser(UUID idUser, User user) {
		listAllUsers.add(new User(	idUser, 
									user.getGenderUser(),
									user.getFirstNameUser(),
									user.getLastNameUser(),
									user.getAgeUser(),
									user.getOccupationUser(),
									user.getPrivilegeUser()
		));
		return 1;
	}

	@Override
	public List<User> selectAllUsers() {
		return listAllUsers;
	}

	@Override
	public Optional<User> selectUserById(UUID idUser) {
		return listAllUsers.stream()
				.filter(user -> user.getIdUser().equals(idUser))
				.findFirst();
	}

	@Override
	public boolean deleteUserById(UUID idUser) {
		Optional<User> user = selectUserById(idUser);
		if(user.isEmpty()) {
			return false;
		}
		listAllUsers.remove(user.get());
		return true;
	}

	@Override
	public boolean updateUserById(UUID idUser, User userToUpdate) {
		return selectUserById(idUser).map(user -> {
			int indexOfUserToUpdate = listAllUsers.indexOf(user);
			if(indexOfUserToUpdate >= 0) {
				listAllUsers.set(indexOfUserToUpdate, new User(	
						idUser, 
						userToUpdate.getGenderUser(),
						userToUpdate.getFirstNameUser(),
						userToUpdate.getLastNameUser(),
						userToUpdate.getAgeUser(),
						userToUpdate.getOccupationUser(),
						userToUpdate.getPrivilegeUser()
					));
				return true;
			}
			return false;
		})
		.orElse(false);
	}
}
