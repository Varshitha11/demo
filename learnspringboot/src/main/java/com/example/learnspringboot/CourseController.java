package com.example.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","in28mins"),
				new Course(2,"Learn AWS","in28mins"),
				new Course(3,"devops","in28mins"),
				new Course(4,"azure","in28mins")
				);
				
				
	}

}
