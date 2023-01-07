package com.example.MovieService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MovieService.entity.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Integer>{

}
