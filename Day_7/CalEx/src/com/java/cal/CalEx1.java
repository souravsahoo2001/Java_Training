package com.java.cal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalEx1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		/*Convert Calender to Date*/
		Date date = cal.getTime();
		System.out.println("Util Date "+date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));
	}

}
