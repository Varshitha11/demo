package com.example.educationmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.educationmanagement.entity.Course;
import com.example.educationmanagement.repo.CourseRepository;

@Service
@Repository
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void saveCourses(Course course) {
		// TODO Auto-generated method stub
		this.courseRepository.save(course);

	}

	@Override
	public void deleteCourseById(long id) {
		// TODO Auto-generated method stub
		this.courseRepository.deleteById(id);
	}

	@Override
	public Course getCourseById(long id) {
		// TODO Auto-generated method stub
		Optional<Course> optional = courseRepository.findById(id);
		Course course = null;
		if (optional.isPresent()) {
			course = optional.get();
		} else {
			throw new RuntimeException("course not found by id" + id);
		}
		return course;
	}

	
}
