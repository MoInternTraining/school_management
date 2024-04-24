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
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(referencedColumnName = "person_id")
	private PersonInfo personInfo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(referencedColumnName = "classroom_id")
	private Classroom classroom;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "grade_id")
	private Grade grade;

	public Student(PersonInfo personInfo, Classroom classroom, Grade grade) {
		super();
		this.personInfo = personInfo;
		this.classroom = classroom;
	}
	
	public Student() {
		super();
	}
}
