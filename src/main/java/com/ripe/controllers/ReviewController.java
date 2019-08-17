package com.ripe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.Movie;
import com.ripe.models.Review;
import com.ripe.models.User;
import com.ripe.services.MovieService;
import com.ripe.services.ReviewService;
import com.ripe.services.UserService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReviewService reviewService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	MovieService movieService;
	
//	@PostMapping("")
//	public Review createReview(@RequestBody ReviewDTO rDTO) {
//		User author = userService.getById(rDTO.getUserId());
//		Movie movie = movieService.getById(rDTO.getMovieId());
//		Review review = new Review();
//		review.setUser(author);
//		review.setMovie(movie);
//		review.setTitle(rDTO.getTitle());
//		review.setReview(rDTO.getReview());
//		review.setRating(rDTO.getRating());
//		return reviewService.createReview(review);
//	}
	
	/**
	 * creates a new review
	 * @param review object from the request
	 * @return a review object
	 */
	@PostMapping("")
	public Review createReview(@RequestBody Review review) {		
		return reviewService.createReview(review);
	}
	
	/**
	 * gets all reviews the were authored by a certain user
	 * @param id of the author
	 * @return a list of reviews by the author
	 */
	@GetMapping("/user/{id}")
	public List<Review> getAllReviewsByUserId(@PathVariable int id) {
		User user = userService.getUserById(id);
		return reviewService.getAllReviewsByUser(user);
	}
	
	/**
	 * gets all reviews the were written for a certain movie
	 * @param id of the movie
	 * @return a list of reviews for the movie
	 */
	@GetMapping("/movie/{id}")
	public List<Review> getAllReviewsByMovieId(@PathVariable int id) {
		Movie movie = movieService.getById(id);
		return reviewService.getAllReviewsByMovie(movie);
	}

}