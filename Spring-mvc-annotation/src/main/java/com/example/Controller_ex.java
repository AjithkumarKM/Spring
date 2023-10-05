package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller_ex {

	@Autowired
	StudentsDao dao;
	
	//Example of Annotated java spring MVC along with jdbc template
	@GetMapping("hello")
	public ModelAndView sayHello() {
		//can use model and view object and setviewname(jspfile) and return it
		//to avoid internal resource view resolver
		ModelAndView model = new ModelAndView("/sayhello");
		//model.setViewName("sayhello");
		model.addObject("msg","hello");
		return model;
	}
	
	@GetMapping("hello2")
	public String sayHello1() {
		return "sayhelo";
	}
	
	@GetMapping("students")
	public String getStudents(Model model) {
		model.addAttribute("students", dao.getStudents());
		System.out.println("hloo" +  dao.getStudents());
		return "getinfo";
	}
}
