package com.codegnan.javaapp11022026.employee;

//Entity/ Bean class
public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String dateOfJoin;
	private String email;
	private String mobileNo; 
	
	public Employee() {}
	
	public Employee(int employeeId, String firstName, String lastName, String dateOfJoin, String email, String mobileNo){
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoin = dateOfJoin;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	public Employee(int employeeId, String firstName, String lastName, String dateOfJoin) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoin = dateOfJoin;
	}

	public Employee(int employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//Getter/ Accessor methods
	
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
	
	//SETTER/ MUTATOR methods

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
}
