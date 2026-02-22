package com.codegnan.javaapp21022026.dateandtime;

import java.util.Calendar;
import java.util.Date;

public class DateClass {
	
	public static void main(String[] args) {
		Date date = new Date();
		
		int dd = date.getDate();
		int mm = date.getMonth();
		mm++; //month is by default counted from 0
		int yyyy = date.getYear();
		yyyy+= 1900; // year is counted from 1900
		
		int hours = date.getHours();
		int minutes = date.getMinutes();
		int seconds = date.getSeconds();
		
		
		System.out.println("current date : " + dd +"."+ mm + "." + yyyy);
		System.out.println("current time : " + hours +":"+ minutes + ":" + seconds );
	}
}
