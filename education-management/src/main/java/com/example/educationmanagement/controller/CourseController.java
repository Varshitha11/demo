package com.example.educationmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.educationmanagement.entity.Course;
import com.example.educationmanagement.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	private CourseService service;
	
	@GetMapping("/allList")
	public String  viewHomePage(Model model) {
		List<Course> course = service.getAllCourses();
		model.addAttribute("getAllCourses",course);
		return "index";
	}
	
	@GetMapping("/new")
    public String showNewCoursePage(Model model) {
        Course course = new Course();
        model.addAttribute("course", course);
        return "index";
    }
	
	 @PostMapping("/save")
	    public String saveCourses(@ModelAttribute("course") Course course) {
	        service.saveCourses(course);
	        
	        return "index";
	    }
	
	 @GetMapping("/deleteCourse/{id}")
		public String deleteCourse(@PathVariable (value = "id") long id) {
			
			// call delete employee method 
			this.service.deleteCourseById(id);
			return "redirect:/";
		}

}