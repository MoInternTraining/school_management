package com.school.service;

import java.util.List;

import com.school.model.Grade;

public interface GradeService {
	public List<Grade> getGrade();
	
	public void findTeacherByGradeId(int gradeId);
	
	public void findStudentByGradeId(int gradeId);
}
