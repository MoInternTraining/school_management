package com.school.service;

import java.util.List;

import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;

public interface TeacherService {
	public void keepTeacherRecord(Teacher teacher);
	
	public void deleteTeacherAllRecord();

	public void updateTeacherRecord(Teacher teacher);

	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
	
	public List<Teacher> showAllTeacherRecords();

	void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
}
