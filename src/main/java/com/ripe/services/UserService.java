package com.ripe.services;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;

import com.ripe.models.User;
import com.ripe.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByPassword(String password) {
		return userRepository.findByPassword(password);
	}	

	public User save(User user){
		return userRepository.save(user);
	}
	
	// gets a user by id otherwise throws an exception
		@Transactional(propagation = Propagation.NEVER)
		public User getUserById(int id) {
			return userRepository.findById(id)
					.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
		}
	
		// updates a user
		// technically not needed - could use create User
		public User updateUser(User update) {
			return userRepository.save(update);
		}
}