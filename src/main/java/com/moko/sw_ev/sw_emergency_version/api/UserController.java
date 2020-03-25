package com.moko.sw_ev.sw_emergency_version.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moko.sw_ev.sw_emergency_version.model.User;
import com.moko.sw_ev.sw_emergency_version.service.UserService;

@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public void addUser(User user) {
		userService.addUser(user);
	}
}
