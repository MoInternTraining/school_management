package com.school.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int studentId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "person_id", unique = false)
	private PersonInfo personInfo;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "classroom_id", unique = false)
	private Classroom classroom;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "grade_id", unique = false)
	private Grade grade;

	public Student(PersonInfo personInfo, Classroom classroom, Grade grade) {
		super();
		this.personInfo = personInfo;
		this.classroom = classroom;
		this.grade = grade;
	}
	
	public Student() {
		super();
	}

	public Student(PersonInfo studentPersonInfo) {
		this.personInfo = studentPersonInfo;
	}
	
}
