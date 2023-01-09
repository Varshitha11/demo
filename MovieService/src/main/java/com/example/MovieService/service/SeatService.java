package com.example.MovieService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieService.Repo.SeatRepository;
import com.example.MovieService.entity.Seats;

@Service
public class SeatService {
      
	@Autowired
	private SeatRepository seatRepo;
	
	public List<Seats> getSeats(Integer showid){
		List<Seats> seats = seatRepo.getSeats(showid);
		return seats;
		
		
	}
}
