package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@SpringBootApplication
@ComponentScan({ "com.example.student" })
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	
	  @Autowired private StudentRepository studentRepository;
	 
	 
	 @Override public void run(String... args) throws Exception { // TODO
			/*
			 * Student student = new Student("Rahim","12/8/2001","Male","Good Student");
			 * studentRepository.save(student);
			 * 
			 * Student student1 = new Student("karim","22/2/1999","Male");
			 * studentRepository.save(student1);
			 * 
			 * Student student2 = new
			 * Student("Sadi","12/12/2012","Male","Brillian Student");
			 * studentRepository.save(student2);
			 */
	 
	 
	 }
	 

}
