package com.infotech.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.cogent.entity.Movie;
import com.infotech.cogent.service.MovieService;

@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	MovieService movieService;
	
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.updateMovie(movie);
	}
	
	@PutMapping("/movie/{id}")
	public Movie editMovie(@PathVariable("id") Long id, @RequestBody Movie movie) {
		Optional<Movie> m = movieService.readMovie(id);
		Movie updateMovie = m.get();
		updateMovie.setName(movie.getName());
		return movieService.updateMovie(updateMovie);
	}
	
	@GetMapping("/movie/{id}")
	public Movie readMovie(@PathVariable("id") Long id) {
		Optional<Movie> m = movieService.readMovie(id);
		return m.get();
	}
	
	@GetMapping("/movie")
	public List<Movie> readMovies(){
		List<Movie> movies = movieService.readMovies();
		System.out.println("Movies read " + movies.size());
		return movies;
	}
	
	@DeleteMapping("/movie")
	public String deleteMovie(@RequestParam(value="id") Long id) {
		Optional<Movie> m = movieService.readMovie(id);
		movieService.deleteMovie(m.get());
		return "Movie Id " + id + " was deleted";
	}
}
