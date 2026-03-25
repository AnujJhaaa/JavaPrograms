package com.codegnan.javaapp17032026.program;

import com.codegnan.javaapp17032026.mathematics.thread.AdditionThread;
import com.codegnan.javaapp17032026.mathematics.thread.DivisionThread;
import com.codegnan.javaapp17032026.mathematics.thread.MultiplicationThread;
import com.codegnan.javaapp17032026.mathematics.thread.SubstractionThread;

public class MainProgram {
	public static void main(String[] args) {
		AdditionThread additionThread = new AdditionThread();
		SubstractionThread substractionThread = new SubstractionThread();
		MultiplicationThread multiplicationThread = new MultiplicationThread();
		DivisionThread divisionThread = new DivisionThread();
		
		additionThread.start();
		System.out.println("start AdditionThread");
		
		substractionThread.start();
		System.out.println("start SubstractionThread");
		
		multiplicationThread.start();
		System.out.println("start MultiplicationThread");
		
		divisionThread.start();
		System.out.println("start DivisionThread");
	}
}
