package com.codegnan.javaapp18022026.employee;

public class Employee implements Comparable {
	private int employeeId;
	private String firstName;
	private String lastName;
	
	@Override
	public int compareTo(Object o) {
		Employee currentEmployee = this;
		Employee otherEmployee = (Employee)o;
		
		if(currentEmployee.employeeId > otherEmployee.employeeId) {
			return 1;
		}	
		else if(currentEmployee.employeeId < otherEmployee.employeeId) {
			return -1;
		}
		
		return 0;
		
		//return currentEmployee.firstName.compareTo(otherEmployee.firstName);
		//return otherEmployee.firstName.compareTo(currentEmployee.firstName);
		
	}
	
	public Employee() {}
	
	public Employee(int employeeId,String firstName,String lastName ) {
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
