package com.codegnan.javaapp12022026.program;

import java.util.Scanner;

public class FindAge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] months ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        System.out.print("enter your date of birth(dd-mm-yyyy): ");
        String dateOfBirth = scanner.nextLine();
        
       
        int date = Integer.parseInt(dateOfBirth.substring(0, 2));
        int month = Integer.parseInt(dateOfBirth.substring(3, 5));
        int year = Integer.parseInt(dateOfBirth.substring(6));

        int age = 0;

        if(date >=12 && month <=2){
            age  = 2026 - year;
        }
        else {
            age = 2025 - year;
        }

        System.out.println("Date of Birth : " + date + " " + months[month-1] + ", " + year);
        System.out.println("Age : " + age + "yrs.");
        
        /*String temString = "";
        int[] dob = {0,0,0};
        int dobIndex=0;

        for( int index = 0; index<dateOfBirth.length();index++){
            
            if(dateOfBirth.charAt(index)!= '-') {
                temString+= dateOfBirth.charAt(index);
            }
            else {
                dob[dobIndex] = Integer.parseInt(temString);
                temString = "";
                dobIndex++;
            }
        }

        int age = 0;
        if(dob[0]>=12 && dob[1]<=2){
            age = 2026 - dob[2];
        }
        else{
            age = 2025 - dob[2];
        }

        int m = dob[1];
        System.out.println(dob[0] + " " + months[m-1] + ", " + dob[2]);
        System.err.println("Age : " + age + "yrs.");*/     
    }
}