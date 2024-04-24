package com.school.service;

import com.school.model.Student;

public interface StudentService {
	public void keepStudentRecord(Student student);
	
	public void deleteStudentAllRecord();
	
	public int getGradeID(int grade_id);
}
