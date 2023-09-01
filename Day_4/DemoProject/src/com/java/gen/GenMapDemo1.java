package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> names = new Hashtable<Integer, String>();
		names.put(1, "Asif");
		names.put(2, "Sabya");
		names.put(3, "Ariz");
		names.put(4,"Rahul");
		names.put(5, "Sourav");
		
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee no ");
		empno = sc.nextInt();
		String name = names.getOrDefault(empno, "Invalid");
		System.out.println(name);
		
	}
}
