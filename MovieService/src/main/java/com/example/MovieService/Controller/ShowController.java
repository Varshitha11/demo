package com.example.MovieService.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.MovieService.entity.Show;
import com.example.MovieService.service.ShowService;

@RestController
public class ShowController {

	@Autowired
	private ShowService showService;
	
	@GetMapping("/getShowsFromMovieid/{movieid}")
	 public List<Show> getShowsFromMovieid(@PathVariable("movieid") int movieid){
		 List<Show> shows = showService.getShowsFromMovieid(movieid);
		 
		 return shows.stream().collect(Collectors.toSet()).stream().toList();
	 }
	
}
