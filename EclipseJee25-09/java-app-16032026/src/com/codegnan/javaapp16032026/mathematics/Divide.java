package com.codegnan.javaapp16032026.mathematics;

public class Divide extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i =1;i<=5;i++) {
				System.out.println(divide(10,2));
				
				Thread.sleep(2000);
			}
		}	catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
	}
	
	public static int divide(int num1, int num2) {
		int result = num1/num2;
		return result;
	}
}
