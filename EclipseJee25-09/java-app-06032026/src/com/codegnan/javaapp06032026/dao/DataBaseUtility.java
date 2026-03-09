package com.codegnan.javaapp06032026.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtility {
	
	public static void loadDriverClass() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
		}	catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050","root","password");
		} 	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return connection;
	}
	
	public static Statement createStatement(Connection connection) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} 	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return statement;
	}
	
	public static int executeDML(Statement statement,String sql) {
		int rowsAffected = 0;
		try{
			rowsAffected = statement.executeUpdate(sql);
			if(rowsAffected > 0) {
				System.out.println("Record Inserted.");
			}
			
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return rowsAffected;
	}
	
	public static ResultSet createResultSet(Statement statement, String sql) {
		ResultSet resultSet = null;
		try { 
			resultSet = statement.executeQuery(sql);
		}	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return resultSet;
	}
	
	public static void closeResultSet(ResultSet resultSet) {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
		} 	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}
	public static void closeStatement(Statement statement) {
		try {
			if(statement != null) {
				statement.close();
			}
		} 	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}
	public static void closeConnection(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		} 	catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}
}
