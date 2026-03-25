package com.codegnan.javaapp20032026.program;

import com.codegnan.javaapp20032026.mathematics.thread.AdditionThread;
import com.codegnan.javaapp20032026.mathematics.thread.DivisionThread;

public class MainProgram3 {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread.getName() + " thread started running.");
		
		AdditionThread additionThread = new AdditionThread();
		DivisionThread divisionThread = new DivisionThread();
			
		additionThread.start();
		System.out.println(additionThread.getName() + " started.");
		divisionThread.start();
		System.out.println(divisionThread.getName() + " started.");
		
		try {
			additionThread.join();
		} catch(InterruptedException intrpdEx) {
			intrpdEx.printStackTrace();
		}
			
		try {
			divisionThread.join();
		} catch(InterruptedException intrpdEx) {
			intrpdEx.printStackTrace();
		}
				
		System.out.println(currentThread.getName() + " thread ending running.");
	}
}
