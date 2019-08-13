package com.ripe.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.User;
import com.ripe.services.UserService;



@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User createUsers(@Valid @RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/{id}")
	public Optional<User> getRecord(@PathVariable int id) {
		return userService.getUserById(id);
	}
}