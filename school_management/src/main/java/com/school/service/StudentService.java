package com.school.service;

import java.util.List;

import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;

public interface StudentService {
	public Student keepStudentRecord(Student student);
	
	public void deleteStudentAllRecord(int studentId);

	public void updateOrCreateStudentRecord(PersonInfo studentPersonInfo, Student student, int gradeId, int classroomId);

	public void keepStudentRecord(PersonInfo studentPersonInfo, int i, int j);
	
	public List<Student> findAll();
	
	public List<Student> findAllStudents();
	
}
