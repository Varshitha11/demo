package com.example.educationmanagement;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
class EducationManagementApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
		/*
		CourseRepository repository = context.getBean(CourseRepository.class);
		Course course = new Course();
		
		course.setCourseId(2L);
		course.setCourseName("btech");
		course.setDuration(5);
		course.setFees(500d);
		repository.save(course);*/
		
	}

}
