package com.codegnan.javaapp18022026.program;

import java.util.HashSet;
import java.util.TreeSet;

import com.codegnan.javaapp18022026.employee.Employee;

public class MainProgram {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmployeeId(101);
		employee1.setFirstName("Anuj");
		employee1.setLastName("Jha");
		
		Employee employee2 = new Employee(102,"Anurag","Jha");
		Employee employee3 = new Employee(103,"Anupama","Jha");
		Employee employee4 = new Employee(104,"Chandan","Kumar");
		Employee employee5 = new Employee(105,"Chandann","Jha");
		
		/*HashSet employeeSet  = new HashSet();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		employeeSet.add(employee5);*/
		
		TreeSet employeeSet  = new TreeSet();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		employeeSet.add(employee5);
		
		for(Object obj : employeeSet) {
			Employee employee = (Employee)obj;
			
			System.out.println("EmployeeId : " + employee.getEmployeeId());
			System.out.println("First-Name : " + employee.getFirstName());
			System.out.println("Last-Name  : " + employee.getLastName());
			System.out.println();
		}
	}
}
