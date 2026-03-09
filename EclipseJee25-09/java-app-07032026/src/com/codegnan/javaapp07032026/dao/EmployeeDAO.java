package com.codegnan.javaapp07032026.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.codegnan.javaapp07032023.entity.Employee;

public class EmployeeDAO {
	// DAO - Data Access Object, is a design pattern, keeps the database communication and operations, logic different from main-program.
	// i.e. database access logic is separated from business logic.
	
	public int insertRecord(Employee employee) {
		
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

		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return rowsAffected;
	}
	
	public ArrayList<Employee> selectAllRecord() {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "SELECT * FROM employee_information";
		ResultSet resultSet  = DataBaseUtility.createResultSet(statement, sql);
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		try {
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
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		DataBaseUtility.closeResultSet(resultSet);
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return employeeList;	
	}
	
	public Employee selectRecordById(int employeeId) {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "SELECT * FROM employee_information WHERE employee_id = " + employeeId;
		ResultSet resultSet  = DataBaseUtility.createResultSet(statement, sql);
		
		Employee employee = null;
		
		try {
			while(resultSet.next()) {
				employee = new Employee();
				
				employee.setEmployeeId(resultSet.getInt("employee_id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setDateOfJoining(resultSet.getString("date_of_joining"));
				employee.setEmailAddress(resultSet.getString("email_address"));
				employee.setMobileNumber(resultSet.getString("mobile_number"));
				
			}
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		DataBaseUtility.closeResultSet(resultSet);
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return employee;	
	}
	
	public String selectNameByIdAndEmail(int employeeId,String emailAddress) {
		
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "SELECT first_name,last_name FROM employee_information WHERE employee_id = %d AND email_address = '%s'";
		sql = sql.formatted(employeeId,emailAddress);
		ResultSet resultSet  = DataBaseUtility.createResultSet(statement, sql);
		
		String name = "";
		
		try {
			while(resultSet.next()) {
				name = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
			}
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		
		DataBaseUtility.closeResultSet(resultSet);
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return name;	
	}
	
	
	
	public int updateDateofJoiningById(int employeeId, String dateOfJoining) {
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "UPDATE employee_information SET date_of_joining = '%s' WHERE employee_id = %d";
		sql = sql.formatted(dateOfJoining,employeeId);
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
			
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return rowsAffected;
	}
	
	public int deleteRecordById(int employeeId) {
		DataBaseUtility.loadDriverClass();
		Connection connection = DataBaseUtility.getConnection();
		Statement statement = DataBaseUtility.createStatement(connection);
		
		String sql = "DELETE FROM employee_information WHERE employee_id = %d";
		sql = sql.formatted(employeeId);
		
		int rowsAffected = DataBaseUtility.executeDML(statement, sql);
		
		DataBaseUtility.closeStatement(statement);
		DataBaseUtility.closeConnection(connection);
		
		return rowsAffected;

	}
	
	
}
