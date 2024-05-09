package com.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Grade;
import com.school.repository.GradeRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class GradeServiceImpl implements GradeService{
	@Autowired
	private GradeRepository gradeRepositoy;
	
	public List<Grade> getGrade() {
		return this.gradeRepositoy.findAll();
	}
}
