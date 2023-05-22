package com.example.studentmanagement.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.controller.StudentManagementController;
import com.example.studentmanagement.modal.Address;
import com.example.studentmanagement.modal.StudentDTO;
import com.example.studentmanagement.modal.StudentDetailes;
import com.example.studentmanagement.repository.AddressRepository;
import com.example.studentmanagement.repository.StudentDetailesRepository;
import com.example.studentmanagement.service.StudentDetailesService;

@Service
public class StudentDetailesServiceImpl implements StudentDetailesService {
	private static final Logger log = LoggerFactory.getLogger(StudentDetailesServiceImpl.class);
	
	@Autowired
	public StudentDetailesRepository studentDetailesRepository;
	
	@Autowired
	public AddressRepository addressRepository;

	@Override
	public StudentDTO saveStudentwithaddress(StudentDTO studentDTO) {
		log.info("Inside StudentDetailes serviceImple "+studentDTO);
		Address add = new Address();
		add.setCity(studentDTO.getAddress().getCity());
		add.setState(studentDTO.getAddress().getState());
		addressRepository.save(add);
		
		StudentDetailes sd = new StudentDetailes();
		sd.setFname(studentDTO.getFname());
		sd.setLnmae(studentDTO.getLnmae());
		sd.setAddress(add);
		studentDetailesRepository.save(sd);
		log.info("Save Student with address Succefully "+studentDTO);
		return studentDTO;
	}

	@Override
	public List<StudentDetailes> getAlldetailes() {
	return	(List<StudentDetailes>) studentDetailesRepository.findAll();
		
	}

}
