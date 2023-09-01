package com.java.day1;

public class CtoF {

	public void Ctof(double celcius){
		double far;
	    far = (celcius * 9/5) + 32;
	    System.out.println("Farhenite is  "+far);
	}
	
	public static void main(String[] args) {
		double celcius = 37;
		new CtoF().Ctof(celcius);
	}
}
