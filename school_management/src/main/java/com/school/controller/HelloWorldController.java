package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld(Model m) {
		String message = "Hello World, Spring MVC @ Javatpoint";
		m.addAttribute("message", message);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}
}
