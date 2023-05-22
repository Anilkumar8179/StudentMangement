package com.example.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.studentmanagement.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
