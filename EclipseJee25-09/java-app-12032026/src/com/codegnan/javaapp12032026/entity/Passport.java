package com.codegnan.javaapp12032026.entity;

public class Passport {
	private int passportId;
	private String passportNumber;
	private String passportType;
	private String dateOfIssue;
	private String dateofExpiry;
	private String cityOfIssue;
	private String stateOfIssue;
	private int personId;
	
	public Passport() {}

	public Passport(int passportId, String passportNumber, String passportType, String dateOfIssue, String dateofExpiry,
			String cityOfIssue, String stateOfIssue, int personId) {
		super();
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.passportType = passportType;
		this.dateOfIssue = dateOfIssue;
		this.dateofExpiry = dateofExpiry;
		this.cityOfIssue = cityOfIssue;
		this.stateOfIssue = stateOfIssue;
		this.personId = personId;
	}

	public int getPassportId() {
		return passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public String getPassportType() {
		return passportType;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateofExpiry;
	}

	public String getCityOfIssue() {
		return cityOfIssue;
	}

	public String getStateOfIssue() {
		return stateOfIssue;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public void setDateOfExpiry(String dateofExpiry) {
		this.dateofExpiry = dateofExpiry;
	}

	public void setCityOfIssue(String cityOfIssue) {
		this.cityOfIssue = cityOfIssue;
	}

	public void setStateOfIssue(String stateOfIssue) {
		this.stateOfIssue = stateOfIssue;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", passportType="
				+ passportType + ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateofExpiry + ", cityOfIssue="
				+ cityOfIssue + ", stateOfIssue=" + stateOfIssue + ", personId=" + personId + "]";
	}
}
