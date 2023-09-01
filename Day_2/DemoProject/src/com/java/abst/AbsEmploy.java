package com.java.abst;

public class AbsEmploy {

	public static void main(String[] args) {
		Employ[] arr = new Employ[]{
				new Ayush(1, "Ayush", 88465),
				new Shivangi(2, "Shivangi", 74646),
				new Piyush(3, "Piyush", 85784)
		};
		for (Employ employ : arr){
			System.out.println(employ);
		}
	}
}
