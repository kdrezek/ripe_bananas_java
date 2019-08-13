package com.ripe.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.User;
import com.ripe.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user){
		return userRepository.save(user);
	}
	
	public Optional<User> getUserById(int id){
		return userRepository.findById(id);
	}
	
	
}