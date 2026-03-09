package com.codegnan.javaapp05032026.program;

import com.codegnan.javaapp05032026.entity.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MainProgram {
	public static void main(String[] args) {
		Connection dbConn = null;
		Statement dbStmt = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
			dbStmt = dbConn.createStatement();
			
			String sql = "SELECT *  FROM employee_information";
			
			resultSet  = dbStmt.executeQuery(sql);
			ArrayList<Employee> employeeList = new ArrayList<>();
			
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmployeeId(resultSet.getInt("employee_id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDateOfJoining(resultSet.getString("date_of_joining"));
				employee.setEmailAddress(resultSet.getString("email_address"));
				employee.setMobileNumber(resultSet.getString("mobile_number"));
				
				employeeList.add(employee);
			}
			
			for(Employee employee : employeeList) {
				System.out.println(employee);
				System.out.println();
			}
			
		}	catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();	
		}	finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(dbStmt != null) {
					dbStmt.close();
				}
				if(dbConn != null) {
					dbConn.close();
				}
			} catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
	}
}