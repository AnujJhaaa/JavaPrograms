package com.codegnan.javaapp19022026.entity;

public class Product implements Comparable{
	private int id;
	private String name;
	private double price;
	
	@Override
	public int compareTo(Object o) {
		Product currentProduct = this;
		Product otherProduct = (Product)o;
		
		if(currentProduct.id > otherProduct.id) {
			return 1;
		}
		else if(currentProduct.id < otherProduct.id) {
			return -1;
		}
		
		return 0;
	}
	
	public Product() {}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
