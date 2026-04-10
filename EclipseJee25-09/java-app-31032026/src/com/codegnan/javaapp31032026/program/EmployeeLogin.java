package com.codegnan.javaapp31032026.program;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeLogin {
	public static void login(String email_address, String login_password) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdg_hyd_jfs_050", "root","password");
			String sql = "SELECT * FROM employee WHERE email_address = ? AND login_password = ?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1,email_address);
			ps.setString(2,login_password);
			
			/*stmt = conn.createStatement();
			String sql = "SELECT * FROM employee WHERE email_address = '%s' AND login_password = '%s'";
			sql = sql.formatted(email_address,login_password);*/
			
			
			
			resultSet = ps.executeQuery();
			
			if(resultSet.next()) {
				System.out.println("Sign-In succesful.");
				System.out.println("Hello "+ resultSet.getString("first_name") + " " + resultSet.getString("last_name")+".");
			}	else {
				System.out.println("Invalid Log-In credentials.");
			}
				
		} catch(ClassNotFoundException cnfEx) {
			cnfEx.printStackTrace();
		} catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {
			try {
				if(resultSet!=null) {
					resultSet.close();
				}
				
				if(ps!=null) {
					ps.close();
				}
				
				if(conn!=null) {
					conn.close();
				}
				
			} catch(SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}	
	}
	
	public static void main(String[] args) {
		
		/*Console console = System.console();
		String emailAddress = console.readLine();
		char[] password = console.readPassword();
		String loginPassword = new String(password);*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter emailAddress : " );
		String emailAddress = scanner.next();
		System.out.print("enter loginPassword : " );
		String loginPassword = scanner.next();
		
		login(emailAddress, loginPassword);
		scanner.close();
	}
}
