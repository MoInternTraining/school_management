package com.school.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.GradeRepository;
import com.school.repository.TeacherRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private EntityManager entityManager;
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
		Teacher tch = new Teacher(teacherPersonInfo, subject);	
		tch.setGrade(gradeRepository.findById(gradeId).get());
		this.teacherRepository.save(tch);
	}

	@Override
	public List<Teacher> showAllTeacherRecords() {
		return this.teacherRepository.findAll();
	}
	
	@Override
    public void updateOrCreateTeacherRecord(PersonInfo teacherPersonInfo, int gradeId, String subject) {
        Optional<Teacher> aTeacher = this.teacherRepository.findById(teacherPersonInfo.getPersonId());
        if (aTeacher.isEmpty()) {
            try {
                Teacher tch = new Teacher();
                tch.setPersonInfo(entityManager.merge(teacherPersonInfo));
                tch.setSubject(subject);
                tch.setGrade(gradeRepository.findById(gradeId).get());
                this.teacherRepository.save(tch);
            } catch (NoSuchElementException e) {
                System.out.println("Grade with id " + gradeId + " not found");
                return;
            }
        } else {
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
}
