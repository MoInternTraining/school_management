package com.school.service;

import javax.management.loading.ClassLoaderRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Classroom;
import com.school.model.Grade;
import com.school.model.PersonInfo;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.ClassroomRepository;
import com.school.repository.GradeRepository;
import com.school.repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.Data;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	GradeRepository gradeRepository;
	
	@Autowired
	ClassroomRepository classRepository;
	
	public Student keepStudentRecord(Student student) {
		
		return this.studentRepository.save(student);
	}
	
	public void deleteStudentAllRecord(int studentId) {
		this.studentRepository.deleteById(studentId);
	}

	@Override
	@Transactional
	public void keepStudentRecord(PersonInfo studentPersonInfo, int classroomId, int gradeId) {
		Student stu = new Student(studentPersonInfo);
		stu.setClassroom(classRepository.findById(classroomId).get());
		stu.setGrade(gradeRepository.findById(gradeId).get());
		this.studentRepository.save(stu);
	}
	
	public List<Student> findAll() {
		return this.studentRepository.findAll();
	}
	
	public List<Student> findAllStudents(){
		return this.studentRepository.findAll();
	}

	@Override
	public void updateOrCreateStudentRecord(PersonInfo studentPersonInfo, Student student, int gradeId, int classroomId) {
		 Optional<Student> aStudent = this.studentRepository.findById(student.getStudentId());
	        Student tch = aStudent.isPresent() ? aStudent.get() : new Student();
	        if (!aStudent.isPresent()) {
//	                Teacher tch = new Teacher();
//	                tch.setPersonInfo(entityManager.merge(teacherPersonInfo));
	                tch.setPersonInfo(studentPersonInfo);
	        } 
	        else {
//	            Teacher tch =  aTeacher.get();
	            tch.getPersonInfo().setAddress(studentPersonInfo.getAddress());
	            tch.getPersonInfo().setDob(studentPersonInfo.getDob());
	            tch.getPersonInfo().setEmail(studentPersonInfo.getEmail());
	            tch.getPersonInfo().setFatherName(studentPersonInfo.getFatherName());
	            tch.getPersonInfo().setGender(studentPersonInfo.getGender());
	            tch.getPersonInfo().setName(studentPersonInfo.getName());       
	        }
	        tch.setClassroom(classRepository.findById(classroomId).get());
	        tch.setGrade(gradeRepository.findById(gradeId).get());
	        this.studentRepository.save(tch);
	}
}
