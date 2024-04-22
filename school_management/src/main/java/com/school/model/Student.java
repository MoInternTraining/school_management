package com.school.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int studentId;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "person_id")
	private PersonInfo personInfo;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "classroom_id")
	private Classroom classroom;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "grade_id")
	private Grade grade;

	public Student(int studentId, PersonInfo personInfo, Classroom classroom, Grade grade) {
		super();
		this.studentId = studentId;
		this.personInfo = personInfo;
		this.classroom = classroom;
		this.grade = grade;
	}
}
