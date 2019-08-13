package com.ripe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ripe.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
