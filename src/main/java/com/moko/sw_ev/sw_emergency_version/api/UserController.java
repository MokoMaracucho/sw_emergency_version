package com.moko.sw_ev.sw_emergency_version.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moko.sw_ev.sw_emergency_version.model.User;
import com.moko.sw_ev.sw_emergency_version.service.UserService;

@RequestMapping("api/sw_emergency_version/user")
@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public void addUser( @Valid @NonNull @RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(path = "{idUser}")
	public User getUserById(@PathVariable("idUser") UUID idUser) {
		return userService.getUserById(idUser)
						.orElse(null);
	}
	
	@DeleteMapping(path = "{idUser}")
	public void deleteUserById(@PathVariable("idUser") UUID idUser) {
		userService.deleteUserById(idUser);
	}
	
	@PutMapping(path= "{idUser}")
	public void updateUtser(@PathVariable("idUser") UUID idUser, @Valid @NonNull @RequestBody User user) {
		userService.updateUserById(idUser,  user);
	}
}
