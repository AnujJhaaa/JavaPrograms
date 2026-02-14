package com.codegnan.javaapp13022026.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public void readFile(String fileName) {
		File fileToRead = new File(fileName);
		
		try {
			FileInputStream inputStream = new FileInputStream(fileToRead);
			
			int data  = 0;
			
			do {
				data = inputStream.read();
				
				if(data != -1) {
					System.out.print((char)data);
				}
			} while(data != -1);
			
			inputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void writeFile(String readFileName,String writeFileName) {
		File fileToRead = new File(readFileName);
		File fileToWrite = new File(writeFileName);
		
		try { 
			FileInputStream inputStream = new FileInputStream(fileToRead);
			FileOutputStream outputStream = new FileOutputStream(fileToWrite);

			int data = 0;
			do {
				data = inputStream.read();
				
				if(data != -1) {
					outputStream.write(data);
				}
			} while(data != -1);
			
			System.out.println("File written successfully.");
			
			inputStream.close();
			outputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
}
