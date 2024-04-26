package com.school.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.school.config.ApplicationConfig;
import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.service.GradeService;
import com.school.service.PersonInfoService;
import com.school.service.StudentService;
import com.school.service.TeacherService;

public class SchoolApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		StudentService studentService = ctx.getBean(StudentService.class);
		TeacherService teacherService = ctx.getBean(TeacherService.class);
		GradeService gradeService = ctx.getBean(GradeService.class);
		

		PersonInfo studentPersonInfo = new PersonInfo("Mg Mg", "5-7-2005", 'M', "U Ba", "09-123456789", "MgMg123@gmail.com", "Yangon");
		Classroom classroom = new Classroom("Jasmine");
//		
//		Grade grade = gradeService.getGradeById(4);
//		studentService.keepStudentRecord(studentPersonInfo, 3, 5);
		
//		PersonInfo teacherPersonInfo = new PersonInfo("Daw Aye", "9-3-1990", 'F', "U Win Lwin", "09-987987987", "DawAye987@gmail.com", "Yangon");
		
//		PersonInfo teacherPersonInfo = new PersonInfo("Daw Mya", "9-3-1990", 'F', "U Win Aung", "09-545618945", "DawMya987@gmail.com", "Yangon");
//
//		teacherService.keepTeacherRecord(teacherPersonInfo, 10, "Math");
		
		PersonInfo teacherPersonInfo = new PersonInfo("DawMya", "9-3-1990", 'F', "UWinAung", "09-545618945", "Mya987@gmail.com", "Yangon");

		teacherService.keepTeacherRecord(teacherPersonInfo, 10, "Math");

		
		PersonInfo teacherPersonInfo = new PersonInfo("DawAyeAye", "3-10-1880", 'F', "UThaung", "09-345345345", "fhjnfhgg345@gmail.com", "Yangon");
		teacherService.keepTeacherRecord(teacherPersonInfo, 3, "Math");


	}
}
