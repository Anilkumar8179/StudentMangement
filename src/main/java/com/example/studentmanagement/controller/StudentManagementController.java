package com.example.studentmanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentmanagement.modal.StudentDTO;
import com.example.studentmanagement.modal.StudentDetailes;
import com.example.studentmanagement.service.StudentDetailesService;

@RestController
@RequestMapping("api/v1.3")
public class StudentManagementController {

	private static final Logger log = LoggerFactory.getLogger(StudentManagementController.class);

	@Autowired
	public StudentDetailesService studentDetailesService;

	@PostMapping("/SaveStudentDetaileswithAddress")
	public StudentDTO saveStudentWithAddress(@RequestBody StudentDTO studentDTO) {
		log.info("Inside save Student with address " + studentDTO);
		return studentDetailesService.saveStudentwithaddress(studentDTO);
	}

	@GetMapping("/GetAllStudentDetailes")
	public List<StudentDetailes> getAlldetailes() {
		log.info("Inside GetAll Drtailes" );
		return studentDetailesService.getAlldetailes();

	}

}
