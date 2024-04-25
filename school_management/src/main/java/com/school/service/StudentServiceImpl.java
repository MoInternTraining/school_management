package com.school.service;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.repository.ClassroomRepository;
import com.school.repository.GradeRepository;
import com.school.repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	GradeRepository gradeRepo;
	
	@Autowired
	ClassroomRepository classRepo;
	
	public Student keepStudentRecord(Student student) {
		
		return this.studentRepository.save(student);
	}
	
	public void deleteStudentAllRecord() {
		this.studentRepository.deleteAll();
	}

	@Override
	public void updateStudentRecord(Student student) {
		this.studentRepository.save(student);
	}

	@Override
	@Transactional
	public void keepStudentRecord(PersonInfo studentPersonInfo, int classroomId, int gradeId) {
		Student stu = new Student(studentPersonInfo);
		stu.setClassroom(classRepo.findById(classroomId).get());
		stu.setGrade(gradeRepo.findById(gradeId).get());
		this.studentRepository.save(stu);
	}
}
