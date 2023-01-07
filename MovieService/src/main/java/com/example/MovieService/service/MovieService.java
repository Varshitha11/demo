package com.example.MovieService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieService.Repo.MovieRepository;
import com.example.MovieService.entity.Movies;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	

    public Movies getMoviesByTitle(String title){
    return movieRepo.findByTitle(title);
    }
	
	public Movies getMovieById(Integer id) {
		return movieRepo.findById(id).get();
	}
	
	public List<Movies> getAllMovies() {
		List<Movies> movies = movieRepo.findAll();
		return movies;
	}
	
	 public Movies saveMovie(Movies movie) {
	        return movieRepo.save(movie);
	    }
	 
	 public List<Movies> getMoviesFromTheatre(Integer theatreId){
		 List<Movies> movies = movieRepo.getMoviesFromTheatre(theatreId);
		 return movies;
	 }

}
