package com.codegnan.javaapp16022026.program;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter EmployeeId :");
		int employeeId = scanner.nextInt();
		System.out.print("enter first name : ");
		String firstName = scanner.next();
		System.out.print("enter last name : ");
		String lastName = scanner.next();
		System.out.print("enter gender : ");
		char gender = scanner.next().charAt(0);
		System.out.print("enter weight : ");
		double weight = scanner.nextDouble();
		System.out.print("enter the maritial status :");
		boolean isMarried = scanner.nextBoolean();
		
		ArrayList employeeData = new ArrayList();
		
		employeeData.add(employeeId);
		employeeData.add(firstName);
		employeeData.add(lastName);
		employeeData.add(gender);
		employeeData.add(weight);
		employeeData.add(isMarried);
		
		System.out.println("\nEmployee: " + employeeData);
		
	}
}
