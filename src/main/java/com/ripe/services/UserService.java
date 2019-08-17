package com.ripe.services;


import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.User;
import com.ripe.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	Session session;
//	EntityManager entitymanager;
	
//	public User checkUser(User user) {
//		Query query = session.createNamedQuery("findUser");
//	    query.setParameter("username", user.getEmail());
//	    query.setParameter("password", user.getPassword());
//
//	    return (User) query.getSingleResult();
//	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByPassword(String password) {
		return userRepository.findByPassword(password);
	}
	

	public User save(User user){
		return userRepository.save(user);
	}
	
	public Optional<User> getUserById(int id){
		return userRepository.findById(id);
	}
	
}