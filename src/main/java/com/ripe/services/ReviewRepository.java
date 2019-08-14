package com.ripe.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ripe.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
