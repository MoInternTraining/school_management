package com.school.service;

import java.util.NoSuchElementException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.GradeRepository;
import com.school.repository.PersonInfoRepository;
import com.school.repository.TeacherRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private PersonInfoRepository personInfoRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private GradeRepository gradeRepository;
	
	@Autowired
	private EntityManager entityManager;
	
	public void keepTeacherRecord(Teacher teacher) {
		this.teacherRepository.saveAndFlush(teacher);
	}

	@Override
	public void deleteTeacherRecord() {
		this.teacherRepository.deleteAll();		
	}

//	@Override
//	public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject) {
//		Optional<Teacher> opteacher = teacherRepository.findById(teacherPersonInfo.getPersonId());
//		Teacher tch = ;
//		if (opteacher.isPresent()) {
//			tch = opteacher.get();
//			tch.get(teacherPersonInfo.);
//			tch.setGrade(gradeRepository.findById(gradeId).get());
//			tch.setSubject(teacher.getSubject());
//			this.teacherRepository.save(tch);
//		}
//		else{
//			this.teacherRepository.save(teacher);
//		}
//		
//	}
//	public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, Teacher teacher,int gradeId, String subject) {
//		Optional<Teacher> aTeacher = this.teacherRepository.findById(teacher.getTeacherId());
//		Teacher tch = null;
//		if (aTeacher.isEmpty()) {
////			tch.setGrade(gradeRepository.findById(gradeId).get());
//			this.teacherRepository.save(tch);
//		} 
//		else {
//			tch = aTeacher.get();
//			teacherPersonInfo.setAddress(teacherPersonInfo.getAddress());
//			teacherPersonInfo.setDob(teacherPersonInfo.getDob());
//			teacherPersonInfo.setEmail(teacherPersonInfo.getEmail());
//			teacherPersonInfo.setFatherName(teacherPersonInfo.getFatherName());
//			teacherPersonInfo.setGender(teacherPersonInfo.getGender());
//			teacherPersonInfo.setName(teacherPersonInfo.getName());
//			teacher.setSubject(teacher.getSubject());
//			teacher.setGrade(gradeRepository.findById(gradeId).get());
//		}
//		System.out.println("Done");
//	
	@Override
    public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, Teacher teacher, int gradeId, String subject) {
        Optional<Teacher> aTeacher = this.teacherRepository.findById(teacher.getTeacherId());
        if (aTeacher.isEmpty()) {
                Teacher tch = new Teacher();
//                tch.setPersonInfo(entityManager.merge(teacherPersonInfo));
                tch.setPersonInfo(teacherPersonInfo);
                tch.setSubject(subject);
                tch.setGrade(gradeRepository.findById(gradeId).get());
                this.teacherRepository.save(tch);
        } 
        else {
            Teacher tch = aTeacher.get();
            tch.getPersonInfo().setAddress(teacherPersonInfo.getAddress());
            tch.getPersonInfo().setDob(teacherPersonInfo.getDob());
            tch.getPersonInfo().setEmail(teacherPersonInfo.getEmail());
            tch.getPersonInfo().setFatherName(teacherPersonInfo.getFatherName());
            tch.getPersonInfo().setGender(teacherPersonInfo.getGender());
            tch.getPersonInfo().setName(teacherPersonInfo.getName());
            tch.setSubject(subject);
            tch.setGrade(gradeRepository.findById(gradeId).get());
            this.teacherRepository.save(tch);
        }
    }
	
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
}
