package com.example.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.studentmanagement.modal.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
