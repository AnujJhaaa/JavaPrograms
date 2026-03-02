package com.codegnan.javaapp02032026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDeleteQuery {
	public static void main(String[] args) {
		Connection dbConn = null;
		Statement dbStmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
			dbStmt = dbConn.createStatement();
			
			String sql = "UPDATE employee_information SET last_name = 'Samson' WHERE employee_id = 109" ;
			int rowsAffected = dbStmt.executeUpdate(sql);
			
			if(rowsAffected>0) {
				System.out.println("Record Updated.");
			}	else if(rowsAffected == 0) {
				System.out.println("No Record Found.");
			}
			
			sql = "DELETE FROM employee_information WHERE employee_id < 101" ;
			rowsAffected = dbStmt.executeUpdate(sql);
			
			if(rowsAffected>0) {
				System.out.println("Record(s) Deleted.");
			}	else if(rowsAffected == 0) {
				System.out.println("No Record Found.");
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
			}	catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
	}

}
