package com.codegnan.javaapp16032026.program;

import com.codegnan.javaapp16032026.clock.DigitalClock;
import com.codegnan.javaapp16032026.mathematics.Addition;
import com.codegnan.javaapp16032026.mathematics.Divide;
import com.codegnan.javaapp16032026.mathematics.Multiplication;
import com.codegnan.javaapp16032026.mathematics.Substraction;

public class MainProgram {
	public static void main(String[] args) {
		Addition addition = new Addition();
		Substraction substraction = new Substraction();
		Multiplication multiplication = new Multiplication();
		Divide divide = new Divide();
		DigitalClock digitalClock = new DigitalClock();
		
		digitalClock.start();
		addition.start();
		substraction.start();
		multiplication.start();
		divide.start();
	}
}
