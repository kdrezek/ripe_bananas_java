package com.ripe.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripe.models.Movie;
import com.ripe.services.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public Movie save(Movie movie){
		return movieRepository.save(movie);
	}
	
//	public List<Movie> getMoviesById(Iterable<String> id){
//		return movieRepository.findAllById(id);
//	}
	

}

