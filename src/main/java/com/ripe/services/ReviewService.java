package com.ripe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.Movie;
import com.ripe.models.Review;
import com.ripe.services.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	
	@Autowired
	public ReviewService(ReviewRepository reviewRepository) {
		super();
		this.reviewRepository = reviewRepository;
		// TODO Auto-generated constructor stub
	}

	public Review save(Review review){
		return reviewRepository.save(review);
	}
	
//	public Optional<Review> getReviewById(int id){
//		return reviewRepository.findById(id);
//	}

	public List<Review> getReviewsById(String movieId){
		return reviewRepository.findAllById(movieId);
	}
}
