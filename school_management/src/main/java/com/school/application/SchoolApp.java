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
	
//		PersonInfo studentPersonInfo1 = new PersonInfo("Mg Mg", "5-7-2005", 'M', "U Ba", "09-123456789", "MgMg123@gmail.com", "Yangon");		
//		studentService.keepStudentRecord(studentPersonInfo1, 1, 6);
//		
//		PersonInfo studentPersonInfo2 = new PersonInfo("Hla Hla", "10-10-2008", 'F', "U Kaung", "09-567567567", "HlaHla567@gmail.com", "Mandalay");
//		studentService.keepStudentRecord(studentPersonInfo2, 2, 3);
//		
//		PersonInfo studentPersonInfo3 = new PersonInfo("Tun Tun", "3-8-2006", 'M', "U Soe", "09-987987987", "TunTun987@gmail.com", "Mandalay");
//		studentService.keepStudentRecord(studentPersonInfo3, 2, 3);
//		
//		PersonInfo teacherPersonInfo1 = new PersonInfo("Daw Aye", "9-3-1990", 'F', "U Win Lwin", "09-987987987", "DawAye987@gmail.com", "Yangon");
//		teacherService.keepTeacherRecord(teacherPersonInfo1, 10, "Math");
		
//		List<Student> students = studentService.findStudents();
//		
//		for(Student student: students) {
//			System.out.println(student.getPersonInfo());
//		}
//		
//		studentService.deleteStudentAllRecord();
		
//		List<Teacher> teachers = teacherService.showAllTeacherRecords();
//		
//		for (Teacher teacher : teachers) {
//			System.out.println(teacher.getPersonInfo());
//		}
		
		List <Student> students1 = studentService.findAllStudents();
		
		for (Student student : students1) {
			System.out.println(student.getPersonInfo());
		}
	}

}
