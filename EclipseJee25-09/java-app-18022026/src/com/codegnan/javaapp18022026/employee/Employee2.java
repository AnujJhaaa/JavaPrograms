package com.codegnan.javaapp18022026.employee;

public class Employee2 {
	private int employeeId;
	private String firstName;
	private String lastName;
	
	public Employee2() {}
	
	public Employee2(int employeeId,String firstName,String lastName ) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
