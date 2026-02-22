package com.codegnan.javaapp21022026.dateandtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {
	public static void main(String[] args) {
		
		/*GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		int dd = gregorianCalendar.get(Calendar.DATE);
		int mm = gregorianCalendar.get(Calendar.MONTH);
		mm++; //month is by default counted from 0
		int yyyy = gregorianCalendar.get(Calendar.YEAR);
		
		int hours = gregorianCalendar.get(Calendar.HOUR);
		int minutes = gregorianCalendar.get(Calendar.MINUTE);
		int seconds = gregorianCalendar.get(Calendar.SECOND);
		int amPm = gregorianCalendar.get(Calendar.AM_PM);
		
		System.out.println("current date : " + dd +"."+ mm + "." + yyyy);
		System.out.print("current time : " + hours +":"+ minutes + ":" + seconds );
		System.out.println((amPm==0)? " a.m.":" p.m.");*/
		
		GregorianCalendar date1 = new GregorianCalendar(2025,0,21);
		long past = date1.getTimeInMillis();
		
		long current = System.currentTimeMillis();
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTimeInMillis(current);
		
		System.out.println("past ms 	: "+ past);
		System.out.println("current ms 	: "+ current);
		
		int check = date1.compareTo(date2);
		System.out.println((check ==1)? "after":(check==-1)? "before" : "same" );
		
		boolean checkBefore = date1.before(date2);
		System.out.println((checkBefore)?"before ":"after or same");
	}
}
