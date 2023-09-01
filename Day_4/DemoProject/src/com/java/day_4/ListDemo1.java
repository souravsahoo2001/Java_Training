package com.java.day_4;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Arnab");
		names.add("Mukesh");
		names.add("Ganesh");
		names.add("Sireesha");
		names.add("Abhisek");
		System.out.println("Names are ");
		for(Object object : names){
			System.out.println(object);
		names.add(2,"Anirudh");
		System.out.println("Names after adding ");
		for (Object object1 : names){
			System.out.println(object1);
		}
		names.set(2,"Jitendra");
		System.out.println("Names after Update ");
		for(Object object1 : names){
			System.out.println(object1);
			
		}
		names.remove(2,"Jitendra");
		
		}
	}
}
