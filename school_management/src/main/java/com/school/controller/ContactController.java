package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.model.Contact;

@Controller
public class ContactController {
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") @Validated Contact contact, BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.print("Returning contact.jsp page");
			return "redirect:contact";
		}
		//model.addAttribute("contact", contact);
		System.out.println(contact.getFirstName() + " " + contact.getLastName());
		return "redirect:contact";
	}

	@RequestMapping("/contact")
	public ModelAndView showContacts(Model m) {
		m.addAttribute("contact", new Contact());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("contact");

		return modelAndView;
	}
}
