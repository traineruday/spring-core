package com.examples.annotations.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

//	@Autowired
	private Department department;

			
	@Autowired
	public Employee(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
}
