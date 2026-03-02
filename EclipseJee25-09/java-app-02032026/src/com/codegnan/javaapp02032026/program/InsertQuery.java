package com.codegnan.javaapp02032026.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	public static void main(String[] args) {
		Connection dbConn = null;
		Statement dbStmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
			dbStmt = dbConn.createStatement();
			
			String sql = "INSERT INTO employee_information VALUES (109,'Sanju','Sanson','2016-01-14','sanju@samson','5656565656')";
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
				}	catch(SQLException sqlEx) {
						sqlEx.printStackTrace();
				}
		}
	}

}
