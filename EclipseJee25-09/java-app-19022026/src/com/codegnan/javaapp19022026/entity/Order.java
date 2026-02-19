package com.codegnan.javaapp19022026.entity;

public class Order {
	private int id;
	private String orderDate;
	private double orderAmount;
	
	public Order() {}
	
	public Order(int id, String orderDate, double orderAmount) {
		this.id = id;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}
