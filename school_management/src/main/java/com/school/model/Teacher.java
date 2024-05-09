package com.school.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
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
@Table(name = "teacher")
public class Teacher {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private int teacherId;
	
	@Column(name = "subject")
	private String subject;
	
	
//	We have to use these codes to join Teacher entity and Grade entity
<<<<<<< HEAD
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "grade_id", unique = false)
=======
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "grade_id")
>>>>>>> 43b92f638d5776de10ffedcf5da8e80f2f523130
	private Grade grade;

	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "person_id")
	private PersonInfo personInfo;

	public Teacher(PersonInfo personInfo, Grade grade, String subject) {
		super();
		this.subject = subject;
		this.grade = grade;
		this.personInfo = personInfo;
	}
	
	public Teacher() {};
	
	public Teacher(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	
	public Teacher(PersonInfo teacherPersonInfo, String subject) {
		super();
		this.personInfo = teacherPersonInfo;
		this.subject = subject;
	}

<<<<<<< HEAD
	public Teacher() {
		super();
=======
	public Teacher(int teacherId, String subject, Grade grade, PersonInfo personInfo) {
		super();
		this.teacherId = teacherId;
		this.subject = subject;
		this.grade = grade;
		this.personInfo = personInfo;
>>>>>>> 43b92f638d5776de10ffedcf5da8e80f2f523130
	}
	
}


