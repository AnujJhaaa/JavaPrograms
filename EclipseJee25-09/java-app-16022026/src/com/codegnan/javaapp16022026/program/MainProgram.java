package com.codegnan.javaapp16022026.program;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter EmployeeId :");
		int empId = scanner.nextInt();
		System.out.print("enter first name : ");
		String fName = scanner.next();
		System.out.print("enter last name : ");
		String lName = scanner.next();
		System.out.print("enter gender : ");
		char g = scanner.next().charAt(0);
		System.out.print("enter weight : ");
		double weight = scanner.nextDouble();
		System.out.print("enter the maritial status :");
		boolean married = scanner.nextBoolean();
		
		Employee emp1 = new Employee();
		emp1.setEmployeeId(empId);
		emp1.setFirstName(fName);
		emp1.setLastName(lName);
		emp1.setGender(g);
		emp1.setWeight(weight);
		emp1.setIsMarried(married);
		
		Employee[] employees = {emp1};
		System.out.println("\n"+employees[0]);
		
		scanner.close();
	}

}
