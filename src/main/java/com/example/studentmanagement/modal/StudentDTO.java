package com.example.studentmanagement.modal;

public class StudentDTO {

	private Long id;

	private String fname;

	private String lnmae;

	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLnmae() {
		return lnmae;
	}

	public void setLnmae(String lnmae) {
		this.lnmae = lnmae;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
