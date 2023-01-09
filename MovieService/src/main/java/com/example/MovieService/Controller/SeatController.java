package com.example.MovieService.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieService.entity.Seats;
import com.example.MovieService.service.SeatService;
import com.example.MovieService.service.ShowService;

@RestController
public class SeatController {
    
	@Autowired
	private SeatService seatService;
	
	
	@GetMapping("/getSeats/{showid}")
	public List<Seats> getSeats(@PathVariable("showid") Integer showid){
		List<Seats> seats = seatService.getSeats(showid);
		return seats.stream().collect(Collectors.toSet()).stream().toList();
		
	}
}
