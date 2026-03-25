package com.codegnan.javaapp20032026.mathematics.thread;

import com.codegnan.javaapp20032026.mathematics.operation.Division;

public class DivisionThread extends Thread {
	public DivisionThread() {
		setName("Division-Thread");
	}
	
	@Override
	public void run() {		
		System.out.println(getName() + " started running.");
		
		Division division = new Division();
		
		try {
			for (int num = 1; num <= 5; num++) {
				System.out.println(getName() + " running and performing task: " + division.divide(10, 2));
				
				Thread.sleep(1000);
			}
		} catch(InterruptedException intrpdEx) {
				intrpdEx.printStackTrace();
		}
		
		System.out.println(getName() + " ending running.");
	}
}