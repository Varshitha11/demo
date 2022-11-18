package com.example.educationmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.educationmanagement.Dao.CourseDao;
import com.example.educationmanagement.entity.Course;

@RestController
public class CourseController {

	@Autowired
	private CourseDao dao;

	@GetMapping("/start")
	public ModelAndView viewHomePage(Model model) {
		ModelAndView mv = new ModelAndView("courses");
		mv.addObject("courses", dao.getAllCourses());
		return mv;
	}

	@GetMapping("/edit")
	public ModelAndView editCourse(@RequestParam("id") long id) {
		ModelAndView mv = new ModelAndView("editCourses");
		Course course = dao.getCourseById(id);
		mv.addObject("courses", course);
		return mv;

	}

	@PostMapping("/save")
	public ModelAndView saveCourses(@ModelAttribute("course") Course course) {
		ModelAndView mv = new ModelAndView("redirect:/start");
		dao.saveCourses(course);
		return mv;
	}

	@GetMapping("/deleteCourse")
	public ModelAndView deleteCourse(@RequestParam("id") long id) {
		// call delete employee method
		dao.deleteCourseById(id);
		ModelAndView mv = new ModelAndView();
		List<Course> list = dao.getAllCourses();
		mv.addObject("courses", list);
		mv.setViewName("courses");
		return mv;
	}

	@GetMapping("/add")
	public ModelAndView addNewCourse(Model model) {
		
		ModelAndView mv = new ModelAndView("addNewCourses");
		Long id = dao.generateId();
		Course course = new Course();
		course.setCourseId(id);
		mv.addObject("courses", course);
		return mv;

	}
}