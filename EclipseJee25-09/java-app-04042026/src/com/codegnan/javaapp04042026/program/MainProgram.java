package com.codegnan.javaapp04042026.program;

import com.codegnan.javaapp04042026.mathematics.Addition;
import com.codegnan.javaapp04042026.mathematics.ByteAdditionImpl;
import com.codegnan.javaapp04042026.mathematics.IntAdditionImpl;
import com.codegnan.javaapp04042026.mathematics.ShortAdditionImpl;

public class MainProgram {
	public static void main(String[] args) {
		ByteAdditionImpl byteAddition = new ByteAdditionImpl();
		ShortAdditionImpl shortAddition = new ShortAdditionImpl();
		IntAdditionImpl intAddition = new IntAdditionImpl();
		
		byteAddition.add();
		shortAddition.add();
		intAddition.add();
		
		//Anonymous Inner Class
		Addition longAddition = new Addition() {
			@Override
			public void add() {
				System.out.println("add() for long datatype.");
			}
		};
		
		longAddition.add();
		
		//Lambda Expression
		Addition addition = () -> System.out.println("add() of Addition Implementaion");
		addition.add();
		
		Addition addition2 = () -> {
			System.out.println("add() of Addition Implementaion");
		};
		
		
	}
	
}
