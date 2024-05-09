package com.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Grade;
import com.school.model.Student;
import com.school.model.Teacher;
import com.school.repository.GradeRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class GradeServiceImpl implements GradeService {
	@Autowired
	private GradeRepository gradeRepositoy;

	public List<Grade> getGrade() {
		return this.gradeRepositoy.findAll();
	}

	@Override
	public void findTeacherByGradeId(int gradeId) {
		Optional<Grade> grade = this.gradeRepositoy.findById(gradeId);
		List<Teacher> gra = grade.get().getTeachers();
		System.out.println(gra);
	}
	
	public void findStudentByGradeId(int gradeId) {
		Optional<Grade> grade = this.gradeRepositoy.findById(gradeId);
		List<Student> gra = grade.get().getStudents();
		System.out.println(gra);
	}

}
