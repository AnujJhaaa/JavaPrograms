package com.codegnan.javaapp04032026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter employeeId : ");			
		int i1 = scanner.nextInt();			
		System.out.print("enter firstName : ");
		String i2 = scanner.next();
		System.out.print("enter lastName : ");
		String i3 = scanner.next();
		System.out.print("enter dateOfJoin : ");
		String i4 = scanner.next();
		System.out.print("enter emailAddress : ");
		String i5 = scanner.next();
		System.out.print("enter moblieNumber : ");
		String i6 = scanner.next();
		
		Connection dbConn = null;
		Statement dbStmt = null;
		
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
			dbStmt = dbConn.createStatement();
			
			String sql = "INSERT INTO employee_information VALUES (%d,'%s','%s','%s','%s','%s')";
			sql = sql.formatted(i1,i2,i3,i4,i5,i6);
			
			int rowsAffected = dbStmt.executeUpdate(sql);
			if(rowsAffected > 0) {
				System.out.println("Record Inserted.");
			}
			
		}	catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();	
		}	finally {
			try {
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
		
		scanner.close();
	}
}