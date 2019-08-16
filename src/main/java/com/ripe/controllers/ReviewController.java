package com.ripe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins= {"*", "http://localhost:3000"})
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/register")
	public Review createReviews(@RequestBody Review review) {
		return this.reviewService.save(review);
	}
	
	@GetMapping("/{movieId}")
	public List<Review> getRecord(@PathVariable String movieId) {
		return this.reviewService.getReviewsById(movieId);
	}
}
