package com.codegnan.javaapp12032026.entity;

public class Person {
	private int personId;
	private String firstName;
	private String middleName;
	private String lastName;
	private char gender;
	private String dateOfBirth;
	private String cityOfBirth;
	private String stateOfBirth;
	private String fatherName;
	private String motherName;
	private String husbandSpouseName;
	
	public Person() {}
	
	public Person(int personId, String firstName, String middleName, String lastName, char gender, String dateOfBirth,
			String cityOfBirth, String stateOfBirth, String fatherName, String motherName, String husbandSpouseName) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.cityOfBirth = cityOfBirth;
		this.stateOfBirth = stateOfBirth;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.husbandSpouseName = husbandSpouseName;
	}

	public int getPersonId() {
		return personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public char getGender() {
		return gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getCityOfBirth() {
		return cityOfBirth;
	}

	public String getStateOfBirth() {
		return stateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public String getHusbandSpouseName() {
		return husbandSpouseName;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	public void setStateOfBirth(String stateOfBirth) {
		this.stateOfBirth = stateOfBirth;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setHusbandSpouseName(String husbandSpouseName) {
		this.husbandSpouseName = husbandSpouseName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", cityOfBirth="
				+ cityOfBirth + ", stateOfBirth=" + stateOfBirth + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", husbandSpouseName=" + husbandSpouseName + "]";
	}
}
