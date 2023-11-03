package com.annotationConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

	private Employee employee;

	@Autowired
	public Company(Employee employee) {
		this.employee = employee;
	}

	public void getDetails() {
		employee.empDetails();
	}

}
