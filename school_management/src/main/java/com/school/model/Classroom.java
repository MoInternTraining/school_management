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
@Table(name = "classroom")
public class Classroom {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "classroom_id")
	private int classroomId;
	
	@Column(name = "classroom_name")
	private String classroomName;
	
//  No need @JoinColumn annotation
//	Instead, mappedBy is needed
	@OneToMany(mappedBy = "classroom")
	private List<Student> students;

	public Classroom(int classroomId, String classroomName) {
		super();
		this.classroomId = classroomId;
		this.classroomName = classroomName;
	}
}
