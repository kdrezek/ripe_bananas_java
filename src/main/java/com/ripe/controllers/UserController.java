package com.ripe.controllers;

import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.ApiToken;
import com.ripe.models.User;
import com.ripe.services.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;



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
	

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		
			System.out.println("dont worry, im a professional");
			User checked1 = userService.findByEmail(user.getEmail());
			User checked2 = userService.findByPassword(user.getPassword());
			System.out.println(checked1);
			System.out.println(checked2);
			System.out.println(checked1 == checked2);
//		}
		if(checked1 != null && checked1 == checked2) {
		return new ResponseEntity<ApiToken>(
				new ApiToken(Jwts.builder()
						.setSubject("Token")
						.claim("roles", "user")
						.claim("id", user.getId())
						.claim("email", user.getEmail())
						.claim("firstname", user.getFirstname())
						.claim("lastname", user.getLastname())
						.setIssuedAt(new Date())
						.signWith(SignatureAlgorithm.HS256, "ripeBananas")
						.compact()),
					HttpStatus.OK);
	} else {
		return new ResponseEntity<>("Not Allowed!!", HttpStatus.BAD_REQUEST);
	}
	}
}