package com.codegnan.javaapp18032026.program;

import com.codegan.javaapp18032026.mathematics.operation.Addition;
import com.codegnan.javaapp18032026.mathematics.thread.AdditionThread;

public class MainProgram {
	public static void main(String[] args) {
		
		/*AdditionThread additionThread1 = new AdditionThread(10, 2);
		AdditionThread additionThread2 = new AdditionThread(20, 4);
		AdditionThread additionThread3 = new AdditionThread(40, 8);*/
		
		Addition addition = new Addition();
		AdditionThread additionThread1 = new AdditionThread(10, 2, addition);
		AdditionThread additionThread2 = new AdditionThread(20, 4, addition);
		AdditionThread additionThread3 = new AdditionThread(40, 8, addition);
		
		additionThread1.start();
		System.out.println("start Addition-Thread1");
		additionThread2.start();
		System.out.println("start Addition-Thread2");
		additionThread3.start();
		System.out.println("start Addition-Thread3");
		
	}
}
