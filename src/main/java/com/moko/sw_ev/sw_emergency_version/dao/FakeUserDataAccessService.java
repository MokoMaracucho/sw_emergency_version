package com.moko.sw_ev.sw_emergency_version.dao;

import java.util.ArrayList;
import java.util.List;
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
}
