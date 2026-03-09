package com.codegnan.javaapp06032023.entity;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String dateOfJoining;
	private String emailAddress;
	private String mobileNumber;
	
	public Employee() {}

	public Employee(int employeeId, String firstName, String lastName, String dateOfJoining, String emailAddress,
			String mobileNumber) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfJoining=" + dateOfJoining + ", emailAddress=" + emailAddress + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateOfJoining, other.dateOfJoining) && Objects.equals(emailAddress, other.emailAddress)
				&& employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(mobileNumber, other.mobileNumber);
	}
}
