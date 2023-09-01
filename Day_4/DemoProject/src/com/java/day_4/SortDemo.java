package com.java.day_4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Sourabh");
		names.add("Arnab");
		names.add("Jitendra");
		names.add("Rajesh");
		names.add("Ganesh");
		names.add("Abhisek");
		names.add("Ayush");
		names.add("Anirudh");
		System.out.println("Names are ");
		for (Object object : names){
			System.out.println(object);
		}
		
	}
}
