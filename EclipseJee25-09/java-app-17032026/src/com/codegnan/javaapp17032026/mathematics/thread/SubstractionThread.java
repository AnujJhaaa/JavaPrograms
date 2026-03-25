package com.codegnan.javaapp17032026.mathematics.thread;

import com.codegnan.javaapp17032026.mathematics.operations.Substraction;

public class SubstractionThread extends Thread {
	Substraction substraction = new Substraction();
	
	public SubstractionThread() {
		super("Substraction-Thread");
		//setName("Substraction-Thread");
		
		System.out.println("SubstractionThread() : " + getName());
	}

	@Override
	public void run() {
		System.out.println(getName()+ " running.");
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(getName() + " running and performing task : " + substraction.substract(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
		
		System.out.println(getName() + " dead.");
	}

}
