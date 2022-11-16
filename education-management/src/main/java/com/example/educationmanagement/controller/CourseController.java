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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.educationmanagement.entity.Course;
import com.example.educationmanagement.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;
	
	@GetMapping("/data")
	public ModelAndView  viewHomePage(Model model) {
		ModelAndView mv=new ModelAndView("courses");
		mv.addObject("courses",service.getAllCourses());
		return mv;
	}
	
	
	 @GetMapping("/save")
	    public String saveCourses(@ModelAttribute("course") Course course) {
	        service.saveCourses(course);
	        
	        return "allcourse";
	    }
	
	
	 @GetMapping("/deleteCourse")
		public ModelAndView deleteCourse(@RequestParam("id") long id) {
			
			// call delete employee method 
		    service.deleteCourseById(id);
			ModelAndView mv=new ModelAndView();
			List<Course> list = service.getAllCourses();
			mv.addObject("courses",list);
			mv.setViewName("courses");
			return mv;
		}

}