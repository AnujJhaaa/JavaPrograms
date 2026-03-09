package com.codegnan.javaapp04032026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
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
			
			/*ResultSetMetaData metaData = resultSet.getMetaData();
			int noOfColumns = metaData.getColumnCount();
			System.out.println("Columns in ResultSet : " + noOfColumns + "\n" );
			
			for(int i = 1;i<=noOfColumns; i++) {
				System.out.print(metaData.getColumnName(i));
				System.out.println(" : " + metaData.getColumnTypeName(i));
				System.out.println();
			}*/
			
			while(resultSet.next()) {
		
				int employeeId = resultSet.getInt(1);
				String name = resultSet.getString(2) + " " + resultSet.getString(3);
				String dateOfJoin = resultSet.getString(4);
				String email = resultSet.getString(5);
				String mobileNo = resultSet.getString(6);
				
				/*int employeeId = resultSet.getInt("employee_id");
				String name = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
				String dateOfJoin = resultSet.getString("date_of_joining");
				String email = resultSet.getString("email_address");
				String mobileNo = resultSet.getString("mobile_number");*/
				
				System.out.println("Employee Id 	:" + employeeId);
				System.out.println("Employee Name	:" + name);
				System.out.println("Date of Join	:" + dateOfJoin);
				System.out.println("Email Address 	:" + email);
				System.out.println("Mobile Number	:" + mobileNo);
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
