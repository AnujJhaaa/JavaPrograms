package com.codegnan.javaapp17032026.mathematics.thread;

import com.codegnan.javaapp17032026.mathematics.operations.Multiplication;

public class MultiplicationThread extends Thread {
	Multiplication multiplication = new Multiplication();
	
	public MultiplicationThread() {
		super("Multiplication-Thread");
		//setName("Multiplication-Thread");
		
		System.out.println("MultiplicationThread() : " + getName());
	}

	@Override
	public void run() {
		System.out.println(getName() + " running.");
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(getName() + " running and performing task : " + multiplication.multiply(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
		
		System.out.println(getName() + " dead.");
	}
}
