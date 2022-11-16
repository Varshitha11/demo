package com.example.educationmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.educationmanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
