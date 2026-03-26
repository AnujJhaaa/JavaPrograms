package com.codegnan.app.javaapp25032026.entity;

public class Account {
	private int account_id;
	private int account_number;
	private String account_holder_name;
	private String account_type;
	
	public Account() {}

	public Account(int account_id, int account_number, String account_holder_name, String account_type) {
		super();
		this.account_id = account_id;
		this.account_number = account_number;
		this.account_holder_name = account_holder_name;
		this.account_type = account_type;
	}

	public int getAccount_id() {
		return account_id;
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", account_number=" + account_number + ", account_holder_name="
				+ account_holder_name + ", account_type=" + account_type + "]";
	}
}