package com.codegnan.javaapp17032026.mathematics.thread;

import com.codegnan.javaapp17032026.mathematics.operations.Addition;

public class AdditionThread extends Thread{
	Addition addition  = new Addition();
	public AdditionThread() {
		// using parameterized constructor of Thread class
		super("Addition-Thread");
		
		//setName("Addition-Thread");
		
		//getName() - default returns Thread-0, Thread-1 .....
		System.out.println("AdditionThread() : " + getName());
	}

	@Override
	public void run() {
		System.out.println(getName() + " running.");
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(getName() + " running and performing task : " + addition.add(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
		
		System.out.println(getName() + " dead.");
	}
}


