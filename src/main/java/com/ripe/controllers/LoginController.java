//package com.ripe.controllers;
//
//import java.util.Date;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ripe.models.ApiToken;
//import com.ripe.models.Client;
//import com.ripe.models.User;
//import com.ripe.services.UserService;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//@RestController
//@RequestMapping("/login")
//public class LoginController {
//	
//	@Autowired
//	UserService userService;
//	
//	
//	@PostMapping
//	public ResponseEntity<?> login(@RequestBody User user) {
//		
////			System.out.println(userService.checkUser(user));
//			System.out.println("dont worry, im a professional");
////		}
//		if(userService.checkUser(user) != null) {
//		return new ResponseEntity<ApiToken>(
//				new ApiToken(Jwts.builder()
//						.setSubject("Token")
//						.claim("roles", "user")
//						.claim("id", user.getId())
//						.claim("email", user.getEmail())
//						.claim("firstname", user.getFirstname())
//						.claim("lastname", user.getLastname())
//						.setIssuedAt(new Date())
//						.signWith(SignatureAlgorithm.HS256, "ripeBananas")
//						.compact()),
//					HttpStatus.OK);
//	} else {
//		return new ResponseEntity<>("Not Allowed!!", HttpStatus.BAD_REQUEST);
//	}
//	}
//}