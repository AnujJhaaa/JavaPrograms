package com.codegnan.javaapp20032026.program;

import com.codegnan.javaapp20032026.mathematics.thread.AdditionThread;
import com.codegnan.javaapp20032026.mathematics.thread.DivisionThread;

public class MainProgram4 {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread.getName() + " thread started running.");
		
		AdditionThread additionThread = new AdditionThread();
		DivisionThread divisionThread = new DivisionThread();
			
		additionThread.start();
		System.out.println(additionThread.getName() + " started.");
		
		try {
			additionThread.join();
		} catch(InterruptedException intrpdEx) {
			intrpdEx.printStackTrace();
		}
		
		divisionThread.start();
		System.out.println(divisionThread.getName() + " started.");
		
		try {
			divisionThread.join();
		} catch(InterruptedException intrpdEx) {
			intrpdEx.printStackTrace();
		}
				
		System.out.println(currentThread.getName() + " thread ending running.");
	}
}
