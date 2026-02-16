package com.codegnan.javaapp16022026.program;

import java.io.Console;

public class UsingConsole {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("enter your email : ");
		String email = console.readLine();
		
		System.out.print("enter your password : ");
		char[] password = console.readPassword();
		
		String password2String  = new String(password);
		
		System.out.println("User email : " + email);
		System.out.println("User password : " + password2String);
		
	}
}
