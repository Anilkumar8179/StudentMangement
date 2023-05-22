package com.example.studentmanagement.service;

import com.example.studentmanagement.modal.Student;

public interface StudentService {

	 public Student saveStudentDetiales(Student student);
	 
	 public Iterable<Student> getallstudentdetailes();
	 
	 public Student getDrtailesBasedonid(long id);
}
