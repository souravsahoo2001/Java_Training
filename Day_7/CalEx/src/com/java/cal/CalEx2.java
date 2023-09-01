package com.java.cal;

import java.util.Calendar;

public class CalEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//Demonstrate Calender's get()method
		System.out.println("Current Calender's Year: "+ cal.get(Calendar.YEAR));
		System.out.println("Current Month Day: "+cal.get(Calendar.DATE));
		int month = cal.get(Calendar.MONTH);
		month++;
		System.out.println("Month "+month);
		System.out.println("Hour "+cal.get(Calendar.HOUR));
		System.out.println("Current Minute "+cal.get((Calendar.MINUTE)));
		System.out.println("Current Second "+cal.get((Calendar.SECOND)));
	}

}
