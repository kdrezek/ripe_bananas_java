package com.ripe.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/register")
	public Movie createUsers(@Valid @RequestBody Movie movie) {
		return movieService.save(movie);
	}
	
	@GetMapping("/{poster}")
	public Optional<Movie> getRecord(@PathVariable String poster) {
		return movieService.getMovieByPoster(poster);
	}

}
