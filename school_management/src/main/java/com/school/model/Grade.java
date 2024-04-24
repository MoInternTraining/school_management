package com.school.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

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
	
	@OneToMany(mappedBy = "grade")
	private List<Student> students;
	
	@OneToMany(mappedBy = "grade")
	private List<Teacher> teachers;
	
	
	
	public Grade(int gradeNo) {
		super();
		this.gradeNo = gradeNo;
	}
	
	public Grade() {
		super();
	}
}
