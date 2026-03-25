package com.codegnan.javaapp23032026.program;

import com.codegnan.javaapp23032026.tokengenerator.TokenGenerator;
import com.codegnan.javaapp23032026.tokengeneratorthread.TokenGeneratorThread;

public class MainProgram {
	public static void main(String[] args) throws InterruptedException {
		TokenGenerator tokenGenerator = new TokenGenerator();
		
		TokenGeneratorThread tokenGeneratorThread1 = new TokenGeneratorThread(tokenGenerator);
		TokenGeneratorThread tokenGeneratorThread2 = new TokenGeneratorThread(tokenGenerator);
		TokenGeneratorThread tokenGeneratorThread3 = new TokenGeneratorThread(tokenGenerator);
		
		tokenGeneratorThread1.start();
		tokenGeneratorThread2.start();
		tokenGeneratorThread3.start();
	}
}
