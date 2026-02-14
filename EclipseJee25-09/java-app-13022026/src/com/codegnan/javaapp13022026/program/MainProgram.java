package com.codegnan.javaapp13022026.program;

import com.codegnan.javaapp13022026.file.FileHandling;

public class MainProgram {
	public static void main(String[] args) {
		FileHandling file = new FileHandling();
		//file.readFile("/Users/anujjha/Desktop/test/web.html");
		
		file.writeFile("/Users/anujjha/Desktop/test/web.html","/Users/anujjha/Desktop/test/webcopy.pdf");
	}
}
