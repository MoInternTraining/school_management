package com.school.service;

import java.util.List;

import com.school.model.Classroom;
import com.school.model.Student;

public interface ClassroomService {
	public void keepClassroomName(Classroom classroom);
	public Classroom find(int id);
}
