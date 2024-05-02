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
import lombok.ToString;
import net.bytebuddy.asm.Advice.This;

@Data
@Entity
@Table(name = "grade")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "grade_id", unique = false)
	@ToString.Exclude
	private int gradeId;

	@Column(name = "grade_no")
	@ToString.Exclude
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

	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", gradeNo=" + gradeNo + "]";
	}
}
