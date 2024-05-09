package com.school.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "classroom")
public class Classroom {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "classroom_id", unique = false)

	private int classroomId;

	@Column(name = "classroom_name")
	private String classroomName;

//  No need @JoinColumn annotation
//	Instead, mappedBy is needed

	@OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST )
	private List<Student> students;

	public Classroom(String classroomName) {
		super();
		this.classroomName = classroomName;
	}

	public Classroom() {
		super();
	}

}
