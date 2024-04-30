package com.school.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Grade;
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

//	@Override
//	public void updateOrCreateTeacherRecord(Teacher teacher, int gradeId, String subject) {
//		Optional<Teacher> opteacher = teacherRepository.findById(teacher.getTeacherId());
//		Teacher tch;
//		if (opteacher.isPresent()) {
//			tch = opteacher.get();
//			tch.setPersonInfo(teacher.getPersonInfo());
//			tch.setGrade(teacher.getGrade());
//			tch.setSubject(teacher.getSubject());
//			this.teacherRepository.save(tch);
//		}
//		else {
//			this.teacherRepository.save(teacher);
//		}
//	}

	@Override
	public void keepTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject) {
		Teacher tch = new Teacher(teacherPersonInfo, subject);
		tch.setGrade(gradeRepository.findById(gradeId).get());
		this.teacherRepository.save(tch);
	}
	
	public List<Teacher> findAll() {
		return this.teacherRepository.findAll();
	}
	
	public void updateOrCreateTeacherRecord(PersonInfo personInfo, int id,int grade, String subject) {
		Teacher aTeacher = this.teacherRepository.find(id);
		if (aTeacher == null) {
			this.keepTeacherRecord(personInfo, grade, subject);
		} else {
			personInfo.setAddress(personInfo.getAddress());
			personInfo.setDob(personInfo.getDob());
			personInfo.setEmail(personInfo.getEmail());
			personInfo.setFatherName(personInfo.getFatherName());
			personInfo.setGender(personInfo.getGender());
			personInfo.setName(personInfo.getName());
			aTeacher.setGrade(this.gradeRepository.findById(grade).get());
			aTeacher.setSubject(subject);
			
		}
		System.out.println("Done");
	}
}
