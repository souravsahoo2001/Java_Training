package com.java.sup;

public class SupCon {

	public static void main(String[] args) {
		Nitish obj1 = new Nitish(1, "Nitish", 88643);
		Anirudh obj2 = new Anirudh(2, "Anirudh", 88343);
		
		
		Employ obj3 = new Nitish(1, "Nitish", 88643);
		Employ obj4 = new Anirudh(2, "Anirudh", 88343);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
	}
}
