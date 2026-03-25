package com.codegnan.javaapp16032026.clock;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DigitalClock extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				GregorianCalendar gCal = new GregorianCalendar();
				
				int hh = gCal.get(Calendar.HOUR);
				int mm = gCal.get(Calendar.MINUTE);
				int ss = gCal.get(Calendar.SECOND);
				
				System.out.println(hh+":"+mm+":"+ss);
				Thread.sleep(1000);
			}	catch(InterruptedException iEx) {
				iEx.printStackTrace();
			}
		}
	}
}
