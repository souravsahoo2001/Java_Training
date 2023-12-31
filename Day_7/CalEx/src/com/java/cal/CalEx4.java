package com.java.cal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalEx4 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Date (dd-MM-yyyy)");
		String str = sc.next();
		try {
			Date date = sdf.parse(str);
			System.out.println("Original Date is " +date);
			cal.add(Calendar.DATE,15);
			cal.add(Calendar.MONTH,5);
			//Convert Calender date to Util Date
			Date updated = cal.getTime();
			System.out.println("Updated Date "+updated);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
