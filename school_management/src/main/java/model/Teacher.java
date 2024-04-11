package model;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "teacher_id")
	private int teacherId;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "greade_id")
	private int gradeId;
	
	@OneToOne
	@JoinColumn(referencedColumnName = "person_id")
	private PersonInfo personInfo;
	
	public Teacher(int teacherId, String subject, int gradeId, PersonInfo personInfo) {
		super();
		this.teacherId = teacherId;
		this.subject = subject;
		this.gradeId = gradeId;
		this.personInfo = personInfo;
	}
}


