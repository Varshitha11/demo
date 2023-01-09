package com.example.MovieService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MovieService.entity.Seats;

@Repository
public interface SeatRepository extends JpaRepository<Seats, Integer> {
	
	@Query(value = "SELECT * FROM show,showseatmapping,seats where show.show_id = showseatmapping.showid_fk and show.show_id =:showid", nativeQuery = true) 
	List<Seats> getSeats(@Param("showid") Integer showid);

}
