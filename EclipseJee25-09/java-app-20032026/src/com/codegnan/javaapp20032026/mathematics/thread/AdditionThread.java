package com.codegnan.javaapp20032026.mathematics.thread;

import com.codegnan.javaapp20032026.mathematics.operation.Addition;

public class AdditionThread extends Thread {
	public AdditionThread() {
		setName("Addition-Thread");
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " started running.");
		
		Addition addition = new Addition();
		
		try {
			for (int num = 1; num <= 5; num++) {
				System.out.println(getName() + " running and performing task: " + addition.add(10, 2));
				
				Thread.sleep(1000);
			}
		} catch(InterruptedException intrpdEx) {
				intrpdEx.printStackTrace();
		}
		
		System.out.println(getName() + " ending running.");
	}
}