package com.example.MovieService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieService.entity.Screen;
import com.example.MovieService.entity.Show;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer>{
	


}
