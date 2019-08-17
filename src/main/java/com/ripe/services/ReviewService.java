package com.ripe.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.Movie;
import com.ripe.models.Review;
import com.ripe.models.User;
import com.ripe.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	EntityManager entityManager;
	
	ReviewRepository reviewRepository;
	
	@Autowired
	public ReviewService(ReviewRepository reviewRepository) {
		super();
		this.reviewRepository = reviewRepository;
	}

	// creates a new review
	public Review createReview(Review review) {
		return reviewRepository.save(review);
	}

	// finds all reviews by user object
	public List<Review> getAllReviewsByUser(User user) {
		return reviewRepository.findAllByUser(user);
	}

	// finds all reviews by movie object
	public List<Review> getAllReviewsByMovie(Movie movie) {
		return reviewRepository.findAllByMovie(movie);
	}

}