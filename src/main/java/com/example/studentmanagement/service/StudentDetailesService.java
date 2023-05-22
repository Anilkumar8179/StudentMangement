package com.example.studentmanagement.service;

import java.util.List;

import com.example.studentmanagement.modal.StudentDTO;
import com.example.studentmanagement.modal.StudentDetailes;

public interface StudentDetailesService {
 public StudentDTO saveStudentwithaddress(StudentDTO studentDTO);
 public List<StudentDetailes> getAlldetailes();
}
