package com.moko.sw_ev.sw_emergency_version.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.moko.sw_ev.sw_emergency_version.model.User;

public interface UserDao {

	int insertUser(UUID idUser, User user);
	
	default int addUser(User user) {
		UUID idUser = UUID.randomUUID();
		return insertUser(idUser, user);
	}
	
	List<User> selectAllUsers();
	
	Optional<User> selectUserById(UUID idUser);
	
	boolean deleteUserById(UUID idUser);
	
	boolean updateUserById(UUID idUser, User user);
}
