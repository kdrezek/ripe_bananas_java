package com.ripe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.Review;
import com.ripe.services.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	ReviewRepository reviewRepository;
	
	public Review save(Review review){
		return reviewRepository.save(review);
	}
	
	public Optional<Review> getReviewById(int id){
		return reviewRepository.findById(id);
	}

}
