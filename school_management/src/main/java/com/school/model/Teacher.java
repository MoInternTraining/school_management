package com.school.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private int teacherId;

	@Column(name = "subject")
	private String subject;

//	Instead of the following codes,
//	@Column(name = "greade_id")
//	private int gradeId;

//	We have to use these codes to join Teacher entity and Grade entity
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "grade_id", referencedColumnName = "grade_id")
	private Grade grade;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id", referencedColumnName = "person_id", unique = false)
	private PersonInfo personInfo;

	public Teacher(PersonInfo teacherPersonInfo, Grade grade, String subject) {
		super();
		this.subject = subject;
		this.grade = grade;
		this.personInfo = teacherPersonInfo;
	}
	public Teacher(PersonInfo teacherPersonInfo, String subject) {
		super();
		this.personInfo = teacherPersonInfo;
		this.subject = subject;
	}

	public Teacher() {
		super();
	}
	public Teacher(int teacherId, String subject, Grade grade, PersonInfo personInfo) {
		super();
		this.teacherId = teacherId;
		this.subject = subject;
		this.grade = grade;
		this.personInfo = personInfo;
	}

	public Teacher(int teacherId) {
		super();
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
