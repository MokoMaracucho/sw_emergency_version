package com.moko.sw_ev.sw_emergency_version.service;

import com.moko.sw_ev.sw_emergency_version.dao.UserDao;
import com.moko.sw_ev.sw_emergency_version.model.User;

public class UserService {

	private final UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public int addUser(User user) {
		return userDao.addUser(user);
	}
}
