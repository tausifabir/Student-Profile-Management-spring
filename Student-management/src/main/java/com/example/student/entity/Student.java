package com.example.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="student_name",nullable = false)
	private String studentName;

	
	@Column(name="student_gender")
	private String studentGender;
	
	@Column(name="student_note")
	private String studentNote;
	
	
	
	@Column(name="student_birthDay")
	private String studentDate;


	
	

	public Student() {
		super();
	}



	public Student(String studentName,String studentDate, String studentGender) {
		super();
		this.studentName = studentName;
		this.studentDate = studentDate;
		this.studentGender = studentGender;
	}



	public Student(String studentName, String studentDate,String studentGender, String studentNote) {
		super();
		this.studentName = studentName;
		this.studentDate = studentDate;
		this.studentGender = studentGender;
		this.studentNote = studentNote;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getStudentGender() {
		return studentGender;
	}



	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}



	public String getStudentNote() {
		return studentNote;
	}



	public void setStudentNote(String studentNote) {
		this.studentNote = studentNote;
	}



	public String getStudentDate() {
		return studentDate;
	}



	public void setStudentDate(String studentDate) {
		this.studentDate = studentDate;
	}
	
	
	
	

}
