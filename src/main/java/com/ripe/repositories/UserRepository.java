package com.ripe.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ripe.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

//    @Query(value = "Select u from User where email=:email and password=:password")
		User findByEmail(String email);
		User findByPassword(String password);

}