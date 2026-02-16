package com.codegnan.javaapp16022026.program;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private char gender;
	private double weight;
	private boolean isMarried;
	
	public Employee() {}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}	
	
	@Override
	public String toString() {
		return "Employee [ Id : " + employeeId + 
				"		 \nName : " + (firstName + " " + lastName) + 
				"		 \nGender : " + gender + 
				"		 \nWeight : " + weight + 
				"		 \nMarrital status :" + isMarried +" ]";
	}
}
