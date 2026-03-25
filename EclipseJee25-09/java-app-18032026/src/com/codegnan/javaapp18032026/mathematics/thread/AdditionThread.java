package com.codegnan.javaapp18032026.mathematics.thread;

import com.codegan.javaapp18032026.mathematics.operation.Addition;

public class AdditionThread extends Thread {
	
	/*Addition addition  = new Addition();
	int num1,num2 ;
	static int counter;
	
	public AdditionThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		counter++;
		
		setName("Addition-Thread"+ counter);
		//getName() - default returns Thread-0, Thread-1 .....
		System.out.println("AdditionThread() : " + getName());
	}*/
	
	Addition addition;
	int num1,num2 ;
	static int counter;
	
	public AdditionThread(int num1, int num2, Addition addition) {
		this.addition = addition;
		this.num1 = num1;
		this.num2 = num2;
		counter++;
		
		setName("Addition-Thread"+ counter);
		//getName() - default returns Thread-0, Thread-1 .....
		System.out.println("AdditionThread() : " + getName());
	}

	@Override
	public void run() {
		System.out.println(getName() + " running.");
		System.out.println(getName() + " running and performing task : " + addition.add(num1,num2));
		System.out.println(getName() + " dead.");
	}
}