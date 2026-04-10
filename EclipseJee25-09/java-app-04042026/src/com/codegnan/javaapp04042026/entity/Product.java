package com.codegnan.javaapp04042026.entity;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
	private int productId;
	private String name;
	
	//transient keyword is used to hide the data when the object is serialized
	private transient double price;
	
	public Product() {}

	public Product(int productId, String name, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId = " + productId + ", Name = " + name + ", Price = " + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& productId == other.productId;
	}	
}
