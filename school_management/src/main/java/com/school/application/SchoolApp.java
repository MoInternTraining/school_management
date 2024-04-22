package com.school.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.school.config.ApplicationConfig;
import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.service.PersonInfoService;
import com.school.service.StudentService;

public class SchoolApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		PersonInfoService personInfoService = ctx.getBean(PersonInfoService.class);
		StudentService studentService = ctx.getBean(StudentService.class);
		
//		personInfoService.keepPersonInfo(new PersonInfo("Mg Mg", "5-7-2005", 'M', "U Ba", "09-123456789", "MgMg123@gmail.com", "Yangon"));
		personInfoService.keepPersonInfo(new PersonInfo("Hla Hla", "10-10-2008", 'F', "U Kaung", "09-567567567", "HlaHla567@gmail.com", "Mandalay"));
		personInfoService.keepPersonInfo(new PersonInfo("Tun Tun", "3-8-2006", 'M', "U Soe", "09-987987987", "TunTun987@gmail.com", "Mandalay"));
		
//		PersonInfo pInfo = new PersonInfo();
//		Classroom cls = new Classroom();
//		Grade g = new Grade();
		
		studentService.keepStudentRecord(new Student(new PersonInfo(1), new Classroom(1), new Grade(1)));
	}
}
