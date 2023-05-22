package com.example.studentmanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.modal.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;

@Service
public class StudentSeriveImpl implements StudentService {
	@Autowired
	public StudentRepository studentRepository;

	@Override
	public Student saveStudentDetiales(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public Iterable<Student> getallstudentdetailes() {
		return studentRepository.findAll();
	}

	@Override
	public Student getDrtailesBasedonid(long id) {
		
		return studentRepository.findById(id).get();
	}

}
