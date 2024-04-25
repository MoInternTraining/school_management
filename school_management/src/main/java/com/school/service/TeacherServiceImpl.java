package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.GradeRepository;
import com.school.repository.TeacherRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private GradeRepository gradeRepository;
	
	public void keepTeacherRecord(Teacher teacher) {
		this.teacherRepository.saveAndFlush(teacher);
	}

	@Override
	public void deleteTeacherAllRecord() {
		this.teacherRepository.deleteAll();		
	}

	@Override
	public void updateTeacherRecord(Teacher teacher) {
		this.teacherRepository.save(teacher);		
	}

	@Override
	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject) {
		Teacher tch = new Teacher(teacherPersonInfo);
		tch.setGrade(gradeRepository.findById(gradeId).get());
		this.teacherRepository.save(tch);
	}
}
