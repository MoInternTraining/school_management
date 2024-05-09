package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public ModelAndView welcome() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/index.jsp");

		return modelAndView;
	}

	@RequestMapping("/greet")
	public ModelAndView display() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/WEB-INF/result.jsp");
		modelAndView.addObject("result", "Welcome to testing page.");

		return modelAndView;
	}
}
