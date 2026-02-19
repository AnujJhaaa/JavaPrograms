package com.codegnan.javaapp19022026.entity;

public class Customer implements Comparable {
	private int id;
	private String firstName;
	private String lastName;
	
	@Override
	public int compareTo(Object o) {
		Customer currentCustomer = this;
		Customer otherCustomer = (Customer)o;
		
		if(currentCustomer.id > otherCustomer.id) {
			return 1;
		}
		else if(currentCustomer.id < otherCustomer.id) {
			return -1;
		}
		
		return 0;
	}
	
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
