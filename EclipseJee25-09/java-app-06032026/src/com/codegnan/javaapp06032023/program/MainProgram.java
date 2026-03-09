package com.codegnan.javaapp06032023.program;

import java.util.Scanner;
import com.codegnan.javaapp06032023.entity.Employee;
import com.codegnan.javaapp06032026.dao.EmployeeDAO;

public class MainProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter employee-id	: ");
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
		String mobileNo = scanner.next();
		
		System.out.println();
		
		EmployeeDAO employeeDao = new EmployeeDAO();
		Employee employee = new Employee(employeeId,firstName,lastName,dateOfJoining,emailAddress,mobileNo);
		
		employeeDao.insertRecord(employee);
		
		//EmployeeDAO.updateDateofJoining(employeeId, "1111-11-11");
		//EmployeeDAO.deleteRecord(employeeId);
		
		employeeDao.selectRecord();
		scanner.close();
	}
}
