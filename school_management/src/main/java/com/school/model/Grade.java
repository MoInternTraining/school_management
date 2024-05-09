package com.school.model;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.asm.Advice.This;

@Getter
@Setter
@Entity
@Table(name = "grade")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grade_id", unique = false)
	private int gradeId;

	@Column(name = "grade_no")
//	@ToString.Exclude
	private int gradeNo;

	@OneToMany(mappedBy = "grade", fetch = FetchType.EAGER)
	private List<Student> students;

	@OneToMany(mappedBy = "grade", fetch = FetchType.EAGER)
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
	}

	
}
