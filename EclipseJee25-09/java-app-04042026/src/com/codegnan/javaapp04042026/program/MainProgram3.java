package com.codegnan.javaapp04042026.program;

//import com.codegnan.javaapp04042026.mathematics.Math;
//static import
import static com.codegnan.javaapp04042026.mathematics.Math.num1;
import static com.codegnan.javaapp04042026.mathematics.Math.num2;
import static com.codegnan.javaapp04042026.mathematics.Math.add;
import static com.codegnan.javaapp04042026.mathematics.Math.divide;

//import static com.codegnan.javaapp04042026.mathematics.Math.*

import static java.lang.System.out;

public class MainProgram3 {
	public static void main(String[] args) {
		
		/*System.out.println(Math.num1);
		System.out.println(Math.num2);
		Math.add();
		Math.divide();
		*/
		
		out.println(num1);
		out.println(num2);
		add();
		divide(10);
		divide();
	}
}
