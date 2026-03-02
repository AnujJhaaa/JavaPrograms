package com.codegnan.javaapp27022026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
	public static void main(String[] args) {
		Connection dbConn = null;
		Statement dbStmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class found and loaded.");
			
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
			System.out.println("Connection established with the database server.");
			
			dbStmt = dbConn.createStatement();
			System.out.println("Statement created on the database connection.");
				
		} catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {
			try {
				if(dbStmt !=  null) {
					dbStmt.close();
					System.out.println("Statement closed.");
				}
				
				if(dbConn != null) {
					dbConn.close();
					System.out.println("Database-Connection closed.");
				}
			} catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
		
	}
}
