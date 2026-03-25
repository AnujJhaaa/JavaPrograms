package com.codegnan.javaapp20032026.program;

import com.codegnan.javaapp20032026.mathematics.thread.AdditionThread;

public class MainProgram2 {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread.getName() + " thread started running.");
		
		AdditionThread additionThread = new AdditionThread();
		additionThread.start();
		System.out.println(additionThread.getName() + " started.");
		
		try {
			additionThread.join();
		} catch(InterruptedException intrpdEx) {
			intrpdEx.printStackTrace();
		}
				
		System.out.println(currentThread.getName() + " thread ending running.");
	}
}
