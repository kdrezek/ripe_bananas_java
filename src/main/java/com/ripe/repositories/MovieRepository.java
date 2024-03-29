package com.ripe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ripe.models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}