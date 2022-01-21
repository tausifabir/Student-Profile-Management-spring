package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	
	/*
	 * public StudentController(StudentService studentService) { super();
	 * this.studentService = studentService; }
	 */
	
	
	@GetMapping("/students")
	public String getAllStudentList(Model model) {
		model.addAttribute("students",studentService.getAllStudents());
		/*
		 * ModelAndView mv = new ModelAndView(); mv.addObject("students.jsp");
		 * model.addAttribute("message","Hello Java Geeks");
		 */
		return "students";
	}
	
	
	
	// navigate to new students form
	@GetMapping("/students/new")
	public String createNewStudent(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		/*
		 * ModelAndView mv = new ModelAndView(); mv.addObject("students.jsp");
		 * model.addAttribute("message","Hello Java Geeks");
		 */
		return "create_student";
	}

	
	//create & submit new student's data
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.saveStudent(student);
		
		return "redirect:/students";
		
	}
	
	
	// fetch student's data on update form
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		
		//Student student = studentService.getStudentById(id);
		//studentService.saveStudent(student);
		
		model.addAttribute("student",studentService.getStudentById(id));
		return "edit_student";
	}
	
	
	//submit student's updated data
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student")Student student,Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setStudentDate(student.getStudentDate());
		existingStudent.setStudentGender(student.getStudentGender());
		existingStudent.setStudentNote(student.getStudentNote());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
		
	}
	
	
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		// get student from database by id
		
		
		studentService.deleteStudent(id);
		return "redirect:/students";
		
	}
}
