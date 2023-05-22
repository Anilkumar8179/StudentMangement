package com.example.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.modal.Student;
import com.example.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	//Data saved into the database
	@PostMapping("/savedata")
	public Student saveStudentdetailes(@RequestBody Student student) {
		return studentService.saveStudentDetiales(student);
	}
	//Get all Student detailes in DataBase
	@GetMapping("/getalldetailes")
	public Iterable<Student> getAllStudentDetailes()
	{
		return studentService.getallstudentdetailes();
	}
	
	//Get Student detailes baed on id
	@GetMapping("/getdetailesbasedonid/{id}")
	public Student getDetailesbasedonid(@PathVariable long id)
	{
		return studentService.getDrtailesBasedonid(id);
	}
	
	

}
