package com.example.student.service;

import java.util.List;

import com.example.student.entity.Student;

public interface StudentService {
	
	
		
		// show all students
		List<Student>getAllStudents();
		
		
		// create new student
		Student saveStudent(Student student);
		
		
		// get student's data by id
		Student getStudentById(Long id);
		
		// update student
		Student updateStudent(Student student);
		
		// delete student
		void deleteStudent(Long id);
}
