package com.codegnan.javaapp04042026.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.codegnan.javaapp04042026.entity.Product;

public class MainProgram4 {
	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(101);
		product.setName("Maggi Noodles");
		product.setPrice(19.99);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			File file = new File("/Users/anujjha/Desktop/test/java04042026.txt");
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(product);
		
		}	catch(FileNotFoundException fnfEx) {
			fnfEx.printStackTrace();
		}	catch(IOException ioEx) {
			ioEx.printStackTrace();
		}	finally {
			try {
				if(oos!=null) {
					oos.close();
				}
				if(fos!=null) {
					fos.close();
				}
			}	catch(IOException ioEx) {
				ioEx.printStackTrace();
			}	
		}
	}
}
