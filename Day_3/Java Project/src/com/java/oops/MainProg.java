package com.java.oops;

public class MainProg {

	public static void main(String[] args) {
		Training[] arr = new Training[]{
				new Java("OOPS"),
				new DotNet("Lambda"),
				new Angular("Services"),
				new Java("Collections"),
				new Java("JSP"),
				new DotNet("Enitity Framework"),
				new Angular("Forms"),
				new DotNet("Web Api"),
				new Angular("Components"),
				new Java("Threads"),
				new Java("JDBC"),
				new DotNet("Lambda"),
				new Angular("Serivices"),
				new Java("EJB")
				
		};
		for(Training training : arr){
			if(training instanceof Java){
				System.out.println(training);
			}
		}
	}
}
