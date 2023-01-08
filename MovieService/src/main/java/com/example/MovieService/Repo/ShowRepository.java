package com.example.MovieService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MovieService.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer>{
    
	@Query(value = " SELECT *FROM movie,show where movie.id = show.movie_id and movie.id =:movieid" , nativeQuery = true)
	List<Show> getShowsFromMovieid(@Param("movieid")   Integer movieid);
}
