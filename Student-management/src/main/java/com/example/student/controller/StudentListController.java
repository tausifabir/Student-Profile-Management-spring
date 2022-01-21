package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;



@RestController
public class StudentListController {
	
	
	@Autowired
	private StudentService studentService;
	 
	 @GetMapping(path="/api/v1/students",produces={"application/json"}) 
	 public List<Student> getAllStudents() { 
		return studentService.getAllStudents();
	 }

	 @GetMapping(path="/api/v1/student",produces={"application/json"}) 
	 public List<Student> getAllPerson() { 
		return studentService.getAllStudents();
	 }
}
