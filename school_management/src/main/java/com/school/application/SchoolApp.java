package com.school.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.school.config.ApplicationConfig;
import com.school.service.PersonInfoService;

public class SchoolApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		PersonInfoService personInfoService = ctx.getBean(PersonInfoService.class);
	}
}
