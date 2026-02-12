package com.codegnan.javaapp12022026.program;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vowelcount[] = new int[5];
		char vowels[] = {'a','e','i','o','u'};

		System.out.print("enter a sentence : ");
		String sentence = scanner.nextLine();
		sentence = sentence.toLowerCase();
		        
		char[] characters = sentence.toCharArray();
		

		for (char alphabet : characters){
			if(alphabet == 'a'){
				vowelcount[0]++;
		    }
		    else if(alphabet == 'e'){
	            vowelcount[1]++;
		    }
		    else if(alphabet == 'i'){
	            vowelcount[2]++;
	        }
		    else if(alphabet == 'o'){
		    	vowelcount[3]++;
		    }
		    else if(alphabet == 'u'){
		    	vowelcount[4]++;
	        }
		}
		
		System.out.println("Vowles Present are : ");
		for(int i =0 ;i<5;i++){ 
			if(vowelcount[i]>0) {
			System.out.println(vowels[i] + " = " + vowelcount[i]);
			}
		}
	}
}
