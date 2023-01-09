package com.example.MovieService.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieService.Repo.ShowRepository;
import com.example.MovieService.entity.Show;

@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepository;
	
	 public List<Show>  getShowsFromMovieid(Integer movieid){
		 List<Show> shows = showRepository.getShowsFromMovieid(movieid) ;
		 return shows;
	 }
	

}
