v  package com.school.service;

import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;

public interface TeacherService {
	public void keepTeacherRecord(Teacher teacher);
	
	public void deleteTeacherAllRecord();

	public void updateTeacherRecord(Teacher teacher);

	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
	
}
