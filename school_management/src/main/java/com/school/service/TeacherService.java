package com.school.service;

import java.util.List;

import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;

public interface TeacherService {
	public void keepTeacherRecord(Teacher teacher);
	
//	public List<Teacher> getAll();
	
	public void deleteTeacherRecord(int TeacherId);

	public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, Teacher teacher, int gradeId, String subject);

	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
	
	public List<Teacher> findAll();
	
	public List<Teacher> findAllTeacher();
	
}
