package com.codegnan.javaapp23032026.tokengeneratorthread;

import com.codegnan.javaapp23032026.tokengenerator.TokenGenerator;

public class TokenGeneratorThread extends Thread {
	static int counter;
	TokenGenerator tokenGenerator;
	
	public TokenGeneratorThread(TokenGenerator tokenGenerator) {
		this.tokenGenerator = tokenGenerator;
		
		counter++;
		
		setName("TokenGeneratorThread-" + counter);
	}
	
	@Override
	public void run() {
		String tokens = tokenGenerator.generateTokens();
		
		System.out.println("Tokens generated for " + getName() + " are " + tokens);
	}
}