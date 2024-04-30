package com.school.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.school.config.ApplicationConfig;
import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.service.ClassroomService;
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
		ClassroomService classroomService = ctx.getBean(ClassroomService.class);
	
		PersonInfo personInfo = new PersonInfo("SamuelChaungDu", "10-10-99", 'F', "UChaungDu", "598888", "@gmail.com", "Dagon");
		teacherService.updateOrCreateTeacherRecord(personInfo, 4, 1, "Laravel");

		
		List <Student> students1 = studentService.findAllStudents();
		
		for (Student student : students1) {
			System.out.println(student.getPersonInfo());
		}
	}

}
