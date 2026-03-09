package com.codegnan.javaapp04032026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignInLogic {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter emailAddress : " );
		String username = scanner.next();
		System.out.print("enter mobileNumber : " );
		String password = scanner.next();
		
		Connection dbConn = null;
		Statement dbStmt = null;
		ResultSet resultSet = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
			dbStmt = dbConn.createStatement();
			String sql = "SELECT * FROM employee_information WHERE email_address = '%s' AND mobile_number = '%s'";
			sql = sql.formatted(username,password);
			
			resultSet = dbStmt.executeQuery(sql);
			
			if(resultSet.next()) {
				System.out.println("Sign-In succesful.");
				System.out.println("Hello "+ resultSet.getString("first_name") + " " + resultSet.getString("last_name")+".");
			}	else {
				System.out.println("Invalid Log-In....Try Again.");
				System.out.println();
				main(args);
			}
			
		} catch(ClassNotFoundException cnfEx) {
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
			}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
		
		scanner.close();
	}

}
