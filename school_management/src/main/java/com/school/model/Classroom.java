package com.school.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
