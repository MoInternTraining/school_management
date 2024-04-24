package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Teacher;
import com.school.repository.TeacherRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherRepository teacherRepository;
	
	public void keepTeacherRecord(Teacher teacher) {
		this.teacherRepository.saveAndFlush(teacher);
	}
}
