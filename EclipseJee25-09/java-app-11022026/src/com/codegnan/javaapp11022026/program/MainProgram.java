package com.codegnan.javaapp11022026.program;

import com.codegnan.javaapp11022026.employee.Employee;

public class MainProgram {

	public static void main(String[] args) {
		
		 Employee employee1 = new Employee();
		 employee1.setEmployeeId(001);
		 employee1.setFirstName("Shahrukh");
		 employee1.setLastName("Khan");
		 employee1.setDateOfJoin("01.01.2025");
		 employee1.setEmail("shahrukh@email");
		 employee1.setMobileNo("0000000001");
		 
		 Employee employee2 = new Employee(002,"Akshay","Kumar","02.02.2025","akshay@email","0000000786");
		 
		 System.out.println("Employee Id : " + employee1.getEmployeeId());
		 System.out.println("Name : " + employee1.getFirstName() + " " + employee1.getLastName());
		 System.out.println("Date of Joining : " + employee1.getDateOfJoin());
		 System.out.println("Email Id : " + employee1.getEmail());
		 System.out.println("Contact No. : " + employee1.getMobileNo());	
		 
		 System.out.println();

		 System.out.println("Employee Id : " + employee2.getEmployeeId());
		 System.out.println("Name : " + employee2.getFirstName() + " " + employee2.getLastName());
		 System.out.println("Date of Joining : " + employee2.getDateOfJoin());
		 System.out.println("Email Id : " + employee2.getEmail());
		 System.out.println("Contact No. : " + employee2.getMobileNo());		 
	}

}
