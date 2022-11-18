package com.example.educationmanagement.Dao;

import java.util.List;
import com.example.educationmanagement.entity.Course;

public interface CourseDao {
	List<Course> getAllCourses();

	void saveCourses(Course course);

	void deleteCourseById(long id);

	Course getCourseById(long id);
	
	public Long generateId();
		
}
