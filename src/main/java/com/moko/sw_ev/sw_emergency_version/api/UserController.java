package com.moko.sw_ev.sw_emergency_version.api;

import com.moko.sw_ev.sw_emergency_version.model.User;
import com.moko.sw_ev.sw_emergency_version.service.UserService;

public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	public void addUser(User user) {
		userService.addUser(user);
	}
}
