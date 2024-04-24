package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.model.Grade;
import com.school.repository.GradeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GradeServiceImpl implements GradeService{
	@Autowired
	private GradeRepository gradeRepositoy;
	
	public Grade getGradeById(int gradeId) {
		return this.gradeRepositoy.getById(gradeId);
	}
}
