package com.school.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person_info")
public class PersonInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int personId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "gender")
	private char gender;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	public PersonInfo() {
		super();
	}
	
	public PersonInfo(int personId, String name, String dob, char gender, String fatherName, String phoneNo, String email,
			String address) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}

	public PersonInfo(int personId) {
		super();
		this.personId = personId;
	}
}
