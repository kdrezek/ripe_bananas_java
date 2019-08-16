package com.ripe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ripe.models.Movie;
import com.ripe.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@PostMapping("/t")
	public Movie createMovies( @RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
//	@GetMapping("/{id}")
//	public Optional<Movie> getRecords(@PathVariable String id) {
//		return movieService.getMoviesById(id);
//	}

}
