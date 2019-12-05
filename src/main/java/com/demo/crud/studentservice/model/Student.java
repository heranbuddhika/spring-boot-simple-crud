package com.demo.crud.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String fName;

	@Column(name = "last_name", nullable = false)
	private String lName;

	@Column(name = "email_address", nullable = false)
	private String emailAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fName, String lName, String emailAddress) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.emailAddress = emailAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String age) {
		this.emailAddress = age;
	}
}
