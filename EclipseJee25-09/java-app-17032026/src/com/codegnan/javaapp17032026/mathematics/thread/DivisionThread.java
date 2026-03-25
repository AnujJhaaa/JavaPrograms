package com.codegnan.javaapp17032026.mathematics.thread;

import com.codegnan.javaapp17032026.mathematics.operations.Division;

public class DivisionThread extends Thread {
	Division division = new Division();
	
	public DivisionThread() {
		super("Division-Thread");
		//setName("Division-Thread");
		
		System.out.println("DivisionThread() : " + getName());
	}

	@Override
	public void run() {
		System.out.println(getName() + " running.");
		try {
			for(int i =1;i<=5;i++) {
				System.out.println( getName()+ " running and performing task : " + division.divide(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
		
		System.out.println(getName()+ " dead.");
	}
}
