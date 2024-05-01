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
		
//		studentService.keepStudentRecord(studentPersonInfo, 3, 5);
		
//		PersonInfo teacherPersonInfo = new PersonInfo("Daw Aye", "9-3-1990", 'F', "U Win Lwin", "09-987987987", "DawAye987@gmail.com", "Yangon");

//		
//		Grade grade = gradeService.getGradeById(4);
//		studentService.keepStudentRecord(studentPersonInfo, 3, 5);
//		ClassroomService classroomService = ctx.getBean(ClassroomService.class);
//	
//		PersonInfo personInfo = new PersonInfo("SamuelChaungDu", "10-10-99", 'F', "UChaungDu", "598888", "@gmail.com", "Dagon");
//		teacherService.updateOrCreateTeacherRecord(personInfo, 4, 1, "Laravel");

		
		List <Student> students1 = studentService.findAllStudents();
		
//		PersonInfo teacherPersonInfo = new PersonInfo("Daw Mya", "9-3-1990", 'F', "U Win Aung", "09-545618945", "DawMya987@gmail.com", "Yangon");
//
//		teacherService.keepTeacherRecord(teacherPersonInfo, 10, "Math");
//		
		PersonInfo teacherPersonInfo = new PersonInfo("U Hla", "9-3-1990", 'F', "UHtooAung", "09-545618945", "uhla@gmail.com", "Yangon");
//		teacherService.keepTeacherRecord(teacherPersonInfo, 10, "Math");
		Teacher teacher = new Teacher(17);
		teacherService.updateOrCreateTeacherRecord(teacherPersonInfo, teacher,  3, "Java");


//		studentService.keepStudentRecord(studentPersonInfo);
//		studentService.keepStudentRecord(studentPersonInfo, 2, 5);
		
//		PersonInfo teacherPersonInfo1 = new PersonInfo("DawAyeAye", "3-10-1880", 'F', "UThaung", "09-345345345", "fhjnfhgg345@gmail.com", "Yangon");
//		teacherService.keepTeacherRecord(teacherPersonInfo1, 4, "Math");

//		teacherService.deleteTeacherRecord();
		
//		personInfoService.keepPersonInfo(new PersonInfo("Hla Hla", "10-10-2008", 'F', "U Kaung", "09-567567567", "HlaHla567@gmail.com", "Mandalay"));
//		personInfoService.keepPersonInfo(new PersonInfo("Tun Tun", "3-8-2006", 'M', "U Soe", "09-987987987", "TunTun987@gmail.com", "Mandalay"));
		
		
//		studentService.keepStudentRecord(new Student(studentPersonInfo, classroom, student.setGradeID(studentService.getGradeID(3))));

		//		Student student = new Student(studentPersonInfo, classroom, grade.getGradeId());
//		PersonInfo studentPersonInfo = new PersonInfo("MgMg", "5-7-2005", 'F', "U Ba", "09-123456789", "MgMg123@gmail.com", "Yangon");
		
		
		
//		PersonInfo studentPersonInfo1 = new PersonInfo("MgMg", "5-7-2005", 'M', "UBa", "09-123456789", "MgMg123@gmail.com", "Yangon");
//
//
//		studentService.keepStudentRecord(studentPersonInfo, 2, 6);
//		studentService.keepStudentRecord(studentPersonInfo1, 2, 6);
		
		
		
//		
//		teacherService.keepTeacherRecord(new Teacher("English", gradeTaughtByTeacher, teacherPersonInfo));
		
//		studentService.deleteStudentAllRecord();
//		for (Student student : students1) {
//			System.out.println(student.getPersonInfo());
//		}
	}

}
