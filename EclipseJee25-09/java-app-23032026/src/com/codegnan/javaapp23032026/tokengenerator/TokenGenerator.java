package com.codegnan.javaapp23032026.tokengenerator;

public class TokenGenerator {
	int tokenNumber;
	
	//public synchronized String generateTokens() {
	
	public String generateTokens() {
		String tokens = "";
		
		synchronized(this) {
			for(int num = 0; num<10; num++) {
				tokenNumber++;
				
				tokens+= tokenNumber + " " ; 
			}
			tokens = tokens.trim();
		}
		
		return tokens;
	}

}
