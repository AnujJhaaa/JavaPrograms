package com.codegnan.javaapp04042026.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.codegnan.javaapp04042026.entity.Product;

//De-serialization
public class MainProgram5 { 
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			File file = new File("/Users/anujjha/Desktop/test/java04042026.txt");
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			//Object obj = ois.readObject();
			Product product  = (Product)ois.readObject();
			System.out.println(product);
			
			
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}	catch(ClassNotFoundException cnfEx){
			cnfEx.printStackTrace();
		}	finally {
			try {
				if(ois!=null) {
					ois.close();
				}
				if(fis!=null) {
					fis.close();
				}
			}	catch(IOException ioEx) {
				ioEx.printStackTrace();
			}
		}
	}
}
