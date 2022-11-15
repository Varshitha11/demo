package com.example.educationmanagement.service;

import java.util.List;

import com.example.educationmanagement.entity.Course;

public interface CourseService {
List<Course> getAllCourses();
void saveCourses(Course course);
void deleteCourseById(long id);
Course getCourseById(long id);
		
}
