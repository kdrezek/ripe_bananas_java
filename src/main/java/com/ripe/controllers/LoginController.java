package com.ripe.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.ApiToken;
import com.ripe.models.Client;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@PostMapping
	public ResponseEntity<ApiToken> login(@RequestBody Client client) {
		return new ResponseEntity<ApiToken>(
				new ApiToken(Jwts.builder()
						.setSubject(client
						.getClientName())
						.claim("roles", "user")
						.setIssuedAt(new Date())
						.signWith(SignatureAlgorithm.HS256, "ripeBananas")
						.compact()),
					HttpStatus.OK);
	}
}
