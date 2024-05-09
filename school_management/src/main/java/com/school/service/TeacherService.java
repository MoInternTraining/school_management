package com.school.service;
<<<<<<< HEAD

import java.util.List;
=======
>>>>>>> 43b92f638d5776de10ffedcf5da8e80f2f523130

import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;

public interface TeacherService {
	public void keepTeacherRecord(Teacher teacher);
	
	public void deleteTeacherAllRecord();

	public void updateOrCreateTeacherRecord(PersonInfo personInfo, int id,int grade, String subject);

	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
	
	public List<Teacher> showAllTeacherRecords();

	void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject);
}
