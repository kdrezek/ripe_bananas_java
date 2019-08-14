package com.ripe.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.Review;
import com.ripe.services.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/register")
	public Review createReviews(@Valid @RequestBody Review review) {
		return reviewService.save(review);
	}
	
	@GetMapping("/{id}")
	public Optional<Review> getRecord(@PathVariable int id) {
		return reviewService.getReviewById(id);
	}
}
