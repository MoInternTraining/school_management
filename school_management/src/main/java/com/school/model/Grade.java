package com.school.model;

import java.util.List;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import net.bytebuddy.asm.Advice.This;

@Data 
@Entity
@Table(name = "grade")
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grade_id")
	private int gradeId;
	
	@Column(name = "grade_no")
	private int gradeNo;
	
	@OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
	private List<Student> students;
	
	@OneToMany(mappedBy = "grade", fetch = FetchType.LAZY)
	private List<Teacher> teachers;
	
	public Grade(int gradeNo) {
		super();
		this.gradeNo = gradeNo;
	}
	
	public Grade() {
		super();
	}
	

	public Grade(int gradeId, int gradeNo, List<Student> students, List<Teacher> teachers) {
		super();
		this.gradeId = gradeId;
		this.gradeNo = gradeNo;
		this.students = students;
		this.teachers = teachers;
	}

	public Grade(Grade grade) {
		this.gradeId = grade.getGradeId();
	}}
