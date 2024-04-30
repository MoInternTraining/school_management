package com.school.service;

import java.util.List;

import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;

public interface TeacherService {
	public void keepTeacherRecord(Teacher teacher);
	
//	public List<Teacher> getAll();
	
	public void deleteTeacherRecord();

	public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, Teacher teacher, int gradeId, String subject);

	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
	
}
