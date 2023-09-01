package com.java.cal;

import java.util.Calendar;

public class CalEx3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -15);
		System.out.println("15 Days ago: "+ cal.getTime());
		cal.add(Calendar.MONTH, 4);
		System.out.println("Four Months Later "+cal.getTime());
		cal.add(Calendar.YEAR,2);
		System.out.println("2 Years later: "+cal.getTime());
		
	}

	
	
}
