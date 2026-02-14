package com.codegnan.java14022026.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
	public void readFileUsingBytesStream(String fileName) {
		File fileToRead = new File(fileName);
		
		try {
			FileInputStream inputStream = new FileInputStream(fileToRead);
			
			int data  = 0;
			long start = System.currentTimeMillis();
			
			System.out.println("Reading File....");
			
			do {
				data = inputStream.read();
			} while(data != -1);
			
			long end = System.currentTimeMillis();
			
			System.out.println("end.");
			System.out.println("Time reqd. : " + (end - start));
			
			inputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void readFileUsingBufferedBytesStream(String fileName) {
		File fileToRead = new File(fileName);
		
		try {
			FileInputStream inputStream = new FileInputStream(fileToRead);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			
			int data  = 0;
			
			System.out.println("Reading File....");
			long start = System.currentTimeMillis();
			
			do {
				data = bufferedInputStream.read();
			} while(data != -1);
			
			long end = System.currentTimeMillis();
			
			System.out.println("end.");
			System.out.println("Time reqd. : " + (end - start));
			
			bufferedInputStream.close();
			inputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void writeFileUsingBytesStream(String readFileName,String writeFileName) {
		File fileToRead = new File(readFileName);
		File fileToWrite = new File(writeFileName);
		
		try { 
			FileInputStream inputStream = new FileInputStream(fileToRead);
			FileOutputStream outputStream = new FileOutputStream(fileToWrite);

			int data = 0;
			
			System.out.println("Writing File....");
			long start = System.currentTimeMillis();
			
			do {
				data = inputStream.read();
				
				if(data != -1) {
					outputStream.write(data);
				}
			} while(data != -1);
			
			long end  = System.currentTimeMillis();
			System.out.println("File written successfully.");
			System.out.println("Time reqd. : " + (end - start));
			
			inputStream.close();
			outputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void writeFileUsingBufferedBytesStream(String readFileName,String writeFileName) {
		File fileToRead = new File(readFileName);
		File fileToWrite = new File(writeFileName);
		
		try { 
			FileInputStream inputStream = new FileInputStream(fileToRead);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			FileOutputStream outputStream = new FileOutputStream(fileToWrite);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

			int data = 0;
			
			System.out.println("Writing File....");
			long start = System.currentTimeMillis();
			
			do {
				data = bufferedInputStream.read();
				
				if(data != -1) {
					bufferedOutputStream.write(data);
				}
			} while(data != -1);
			
			long end  = System.currentTimeMillis();
			System.out.println("File written successfully.");
			System.out.println("Time reqd. : " + (end - start));
			
			inputStream.close();
			bufferedInputStream.close();
			outputStream.close();
			bufferedOutputStream.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void readFileUsingCharacterStream(String fileName) {
		File fileToRead = new File(fileName);
		
		try {
			FileReader fileReader = new FileReader(fileToRead);
			
			int data  = 0;
			long start = System.currentTimeMillis();
			
			System.out.println("Reading File....");
			
			do {
				data = fileReader.read();
			} while(data != -1);
			
			long end = System.currentTimeMillis();
			
			System.out.println("end.");
			System.out.println("Time reqd. : " + (end - start));
			
			fileReader.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void readFileUsingBufferedCharacterStream(String fileName) {
		File fileToRead = new File(fileName);
		
		try {
			FileReader fileReader = new FileReader(fileToRead);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int data  = 0;
			
			System.out.println("Reading File....");
			long start = System.currentTimeMillis();
			
			do {
				data = bufferedReader.read();
			} while(data != -1);
			
			long end = System.currentTimeMillis();
			
			System.out.println("end.");
			System.out.println("Time reqd. : " + (end - start));
			
			bufferedReader.close();
			fileReader.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void writeFileUsingCharacterStream(String readFileName,String writeFileName) {
		File fileToRead = new File(readFileName);
		File fileToWrite = new File(writeFileName);
		
		try { 
			FileReader filereader = new FileReader(fileToRead);
			FileWriter fileWriter = new FileWriter(fileToWrite);

			int data = 0;
			
			System.out.println("Writing File....");
			long start = System.currentTimeMillis();
			
			do {
				data = filereader.read();
				
				if(data != -1) {
					fileWriter.write(data);
				}
			} while(data != -1);
			
			long end  = System.currentTimeMillis();
			System.out.println("File written successfully.");
			System.out.println("Time reqd. : " + (end - start));
			
			filereader.close();
			fileWriter.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
	
	public void writeFileUsingBufferedCharacterStream(String readFileName,String writeFileName) {
		File fileToRead = new File(readFileName);
		File fileToWrite = new File(writeFileName);
		
		try { 
			FileReader filereader = new FileReader(fileToRead);
			BufferedReader bufferedReader = new BufferedReader(filereader);
			FileWriter fileWriter = new FileWriter(fileToWrite);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			int data = 0;
			
			System.out.println("Writing File....");
			long start = System.currentTimeMillis();
			
			do {
				data = bufferedReader.read();
				
				if(data != -1) {
					bufferedWriter.write(data);
				}
			} while(data != -1);
			
			long end  = System.currentTimeMillis();
			System.out.println("File written successfully.");
			System.out.println("Time reqd. : " + (end - start));
			
			filereader.close();
			bufferedReader.close();
			fileWriter.close();
			bufferedWriter.close();
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
	}
}
