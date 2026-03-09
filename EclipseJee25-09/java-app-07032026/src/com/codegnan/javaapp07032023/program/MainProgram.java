package com.codegnan.javaapp07032023.program;

import java.util.Scanner;
//import com.codegnan.javaapp07032023.entity.Employee;
import com.codegnan.javaapp07032026.dao.EmployeeDAO;

public class MainProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("enter employee-id	: ");
		int employeeId = scanner.nextInt();
		System.out.print("enter fisrt-name	: ");
		String firstName = scanner.next();
		System.out.print("enter last-name	: ");
		String lastName = scanner.next();
		System.out.print("enter dateOfJoining	: ");
		String dateOfJoining = scanner.next();
		System.out.print("enter email-address	: ");
		String emailAddress = scanner.next();
		System.out.print("enter mobile-number	: ");
		String mobileNo = scanner.next();*/
		
		System.out.print("enter employee-id	: ");
		int employeeId = scanner.nextInt();
		System.out.print("enter email-address	: ");
		String emailAddress = scanner.next();
		
		System.out.println();
		
		EmployeeDAO employeeDao = new EmployeeDAO();
		//Employee employee = new Employee(employeeId,firstName,lastName,dateOfJoining,emailAddress,mobileNo);
		
		String name = employeeDao.selectNameByIdAndEmail(employeeId, emailAddress);
		
		if(!name.isEmpty()) {
			System.out.println("Valid Credentials.");
			System.out.println("Welcome " + name);
		}	else {
			System.out.println("InValid Credentials");
		}
		
		scanner.close();
	}
}
