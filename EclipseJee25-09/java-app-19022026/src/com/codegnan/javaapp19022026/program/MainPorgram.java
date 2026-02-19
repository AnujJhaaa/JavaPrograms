package com.codegnan.javaapp19022026.program;

import java.util.TreeSet;

import com.codegnan.javaapp19022026.entity.Product;
import com.codegnan.javaapp19022026.entity.Customer;
import com.codegnan.javaapp19022026.entity.IdComparator;
import com.codegnan.javaapp19022026.entity.Order;

public class MainPorgram {
	public static void main(String[] args) {
		/*Product product1 = new Product(101,"Maggi",100.0);
		Product product2 = new Product(102,"Orange Juice",110.0);
		Product product3 = new Product(103,"Apple Juice",120.0);
		Product product4 = new Product(104,"NoteBook",140.0);
		Product product5 = new Product(105,"ToothPaste",150.0);
		
		TreeSet<Product> productSet = new TreeSet<>();
		productSet.add(product3);
		productSet.add(product5);
		productSet.add(product1);
		productSet.add(product2);
		productSet.add(product4);
		
		for(Product product : productSet) {
			System.out.println("Product Id    : " + product.getId());
			System.out.println("Product Name  : " + product.getName());
			System.out.println("Product Price : " + product.getPrice());
			System.out.println();
		}*/
		
		/*Customer customer1 = new Customer(101,"Uttam","Ram");
		Customer customer2 = new Customer(102,"Mukesh","Thakur");
		Customer customer3 = new Customer(103,"Aditya","Dhara");
		Customer customer4 = new Customer(104,"Manas","Koley");
		Customer customer5 = new Customer(105,"Suraj","Mal");
		
		TreeSet<Customer> customerSet = new TreeSet<>();
		customerSet.add(customer3);
		customerSet.add(customer5);
		customerSet.add(customer1);
		customerSet.add(customer2);
		customerSet.add(customer4);
		
		for(Customer customer : customerSet) {
			System.out.println("Customer Id 	   : " + customer.getId());
			System.out.println("Customer FirstName : " + customer.getFirstName());
			System.out.println("Customer LastName  : " + customer.getLastName());
			System.out.println();
		}*/
		
		Order order1 = new Order(101,"01.05.2026",100.0);
		Order order2 = new Order(102,"02.04.2026",110.0);
		Order order3 = new Order(103,"03.03.2026",120.0);
		Order order4 = new Order(104,"04.02.2026",130.0);
		Order order5 = new Order(105,"05.01.2026",140.0);
		
		TreeSet<Order> orderSet = new TreeSet<Order>(new IdComparator());
		orderSet.add(order5);
		orderSet.add(order3);
		orderSet.add(order1);
		orderSet.add(order2);
		orderSet.add(order4);
		
		for(Order order : orderSet) {
			System.out.println("Order Id	: " + order.getId());
			System.out.println("Order Date	: " + order.getOrderDate());
			System.out.println("Order Amount	: " + order.getOrderAmount());
			System.out.println();
		}
	}

}
