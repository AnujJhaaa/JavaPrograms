package com.codegnan.app.javaapp25032026.entity;

public class Kyc {
	private int account_id;
	private String pan_number;
	private String aadhaar_number;
	
	public Kyc() {}

	public Kyc(int account_id, String pan_number, String aadhaar_number) {
		super();
		this.account_id = account_id;
		this.pan_number = pan_number;
		this.aadhaar_number = aadhaar_number;
	}

	public int getAccount_id() {
		return account_id;
	}

	public String getPan_number() {
		return pan_number;
	}

	public String getAadhaar_number() {
		return aadhaar_number;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public void setAadhaar_number(String aadhaar_number) {
		this.aadhaar_number = aadhaar_number;
	}

	@Override
	public String toString() {
		return "Kyc [account_id=" + account_id + ", pan_number=" + pan_number + ", aadhaar_number=" + aadhaar_number
				+ "]";
	}
	
}