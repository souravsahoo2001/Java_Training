package com.java.day_4;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabayasachi");
		names.add("Sourav");
		
		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabayasachi");
		names.add("Sourav");
		
		names.add("Asif");
		names.add("Piyush");
		names.add("Ariz");
		names.add("Sabayasachi");
		names.add("Sourav");
		for (Object object : names){
			System.out.println(object);
		}
	}
}
