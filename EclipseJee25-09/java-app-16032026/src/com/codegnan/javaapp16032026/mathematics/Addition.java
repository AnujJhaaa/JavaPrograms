package com.codegnan.javaapp16032026.mathematics;

public class Addition extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(add(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
	}
	
	public static int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
}
