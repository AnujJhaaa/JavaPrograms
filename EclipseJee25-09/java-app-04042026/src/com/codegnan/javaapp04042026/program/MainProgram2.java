package com.codegnan.javaapp04042026.program;

import com.codegnan.javaapp04042026.mathematics.Multiplication;
import com.codegnan.javaapp04042026.mathematics.Substraction;

public class MainProgram2 {
	public static void main(String[] args) {
		
		Multiplication multiplication = (n1,n2) -> System.out.println(n1*n2);
		multiplication.multiply(10, 2);
		
		Substraction substraction = (n1,n2) -> n1-n2;
		substraction.substract(10, 2);
		
		Substraction substraction2 = (n1,n2) -> {
			return n1-n2;
		};
		substraction2.substract(10, 2);
	}
}
