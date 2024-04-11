package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	public Classroom(int classroomId, String classroomName) {
		super();
		this.classroomId = classroomId;
		this.classroomName = classroomName;
	}

	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", classroomName=" + classroomName + "]";
	}
}
