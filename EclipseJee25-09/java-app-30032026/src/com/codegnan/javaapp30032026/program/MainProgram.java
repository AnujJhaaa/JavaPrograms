package com.codegnan.javaapp30032026.program;

import com.codegnan.javaapp30032026.mathopreration.MathOperation;

public class MainProgram {
	public static void main(String[] args) {
		
		/*System.out.println(MathOperation.sine);
		System.out.println(MathOperation.cos);
		System.out.println(MathOperation.theta);
		MathOperation.operation1();
		MathOperation.operation2();*/
		
		
		MathOperation mathOperation1 = new MathOperation();
		MathOperation mathOperation2 = new MathOperation();
		MathOperation mathOperation3 = new MathOperation();
		
		System.out.println(mathOperation1.sine);
		System.out.println(mathOperation2.sine);
		System.out.println(mathOperation3.sine);
		
		mathOperation2.sine = 10;
		
		System.out.println(mathOperation1.sine);
		System.out.println(mathOperation2.sine);
		System.out.println(mathOperation3.sine);
		
		/*System.out.println(mathOperation1.alpha);
		System.out.println(mathOperation2.alpha);
		System.out.println(mathOperation3.alpha);
		
		mathOperation1.alpha = 10;
		
		System.out.println(mathOperation1.alpha);
		System.out.println(mathOperation2.alpha);
		System.out.println(mathOperation3.alpha);*/
		
	}
}
