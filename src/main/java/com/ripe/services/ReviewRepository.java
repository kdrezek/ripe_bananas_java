package com.ripe.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ripe.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{


	public List<Review> findAllById(String movieId);

}
