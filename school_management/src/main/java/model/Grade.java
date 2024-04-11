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
@Table(name = "grade")
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grade_id")
	private int gradeId;
	
	@Column(name = "grade_no")
	private int gradeNo;

	public Grade(int gradeId, int gradeNo) {
		super();
		this.gradeId = gradeId;
		this.gradeNo = gradeNo;
	}

	@Override
	public String toString() {
		return "Grade [gradeId=" + gradeId + ", gradeNo=" + gradeNo + "]";
	}
}
