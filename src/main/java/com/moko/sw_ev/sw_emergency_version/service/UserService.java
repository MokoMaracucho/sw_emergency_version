package com.moko.sw_ev.sw_emergency_version.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.moko.sw_ev.sw_emergency_version.dao.UserDao;
import com.moko.sw_ev.sw_emergency_version.model.User;

@Service
public class UserService {

	private final UserDao userDao;
	
	@Autowired
	public UserService(@Qualifier("fakeDao") UserDao userDao) {
		this.userDao = userDao;
	}

	public int addUser(User user) {
		return userDao.addUser(user);
	}
	
	public List<User> getAllUsers() {
		return userDao.selectAllUsers();
	}
}
