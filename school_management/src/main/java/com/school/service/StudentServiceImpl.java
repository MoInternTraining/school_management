package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Student;
import com.school.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public void keepStudentRecord(Student student) {
		
		this.studentRepository.saveAndFlush(student);
	}
}
