package com.codegnan.javaapp06032026.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.codegnan.javaapp06032023.entity.Employee;

public class EmployeeDAO {
	// DAO - Data Access Object, is a design pattern, keeps the database communication and operations, logic different from main-program.
	// i.e. database access logic is separated from business logic.
	
	public void insertRecord(Employee employee) {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "INSERT INTO employee_information VALUES(%d,'%s','%s','%s','%s','%s')";
		sql = sql.formatted(employee.getEmployeeId(),
						employee.getFirstName(),
						employee.getLastName(),
						employee.getDateOfJoining(),
						employee.getEmailAddress(),
						employee.getMobileNumber());
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
		
		if(rowsAffected > 0) {
			System.out.println("Record Inserted.");
		}
			
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
	}
	
	public void selectRecord() {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "SELECT * FROM employee_information";
		ResultSet resultSet  = DataBaseUtility.createResultSet(statement, sql);
		
		try {
			while(resultSet.next()) {
				Employee employee = new Employee();
				
				employee.setEmployeeId(resultSet.getInt("employee_id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDateOfJoining(resultSet.getString("date_of_joining"));
				employee.setEmailAddress(resultSet.getString("email_address"));
				employee.setMobileNumber(resultSet.getString("mobile_number"));
				
				System.out.println(employee);
				System.out.println();
			}
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		DataBaseUtility.closeResultSet(resultSet);
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
	}
	
	public void updateDateofJoining(int employeeId, String dateOfJoining) {
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "UPDATE employee_information SET date_of_joining = '%s' WHERE employee_id = %d";
		sql = sql.formatted(dateOfJoining,employeeId);
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
		
		if(rowsAffected > 0) {
			System.out.println("Record Updated.");
		}
			
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
	}
	
	public void deleteRecord(int employeeId) {
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "DELETE FROM employee_information WHERE employee_id = %d";
		sql = sql.formatted(employeeId);
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
		
		if(rowsAffected > 0) {
			System.out.println("Record Inserted.");
		}	else if(rowsAffected == 0) {
			System.out.println("No such Record Found.");
		}
			
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);

	}
}
