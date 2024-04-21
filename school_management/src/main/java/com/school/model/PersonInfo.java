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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int personId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "dob")
	private Date dob;
	
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
		
	}
	
	public PersonInfo(int personId, String name, Date dob, char gender, String fatherName, String phoneNo, String email,
			String address) {
		super();
		this.personId = personId;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.fatherName = fatherName;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
}
