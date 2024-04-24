package com.school.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	
//	Instead of the following codes,
//	@Column(name = "greade_id")
//	private int gradeId;
	
//	We have to use these codes to join Teacher entity and Grade entity
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(referencedColumnName = "grade_id")
	private Grade grade;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(referencedColumnName = "person_id")
	private PersonInfo personInfo;

	public Teacher(String subject, Grade grade, PersonInfo personInfo) {
		super();
		this.subject = subject;
		this.grade = grade;
		this.personInfo = personInfo;
	}
}


