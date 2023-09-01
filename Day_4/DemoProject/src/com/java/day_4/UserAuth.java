package com.java.day_4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map userData = new Hashtable();
		userData.put("Abhishek", "Kumar");
		userData.put("Jitendra", "Saho");
		userData.put("Piyush", "Raj");
		userData.put("Rahul", "Raman");
		userData.put("Tanya", "Arora");
		String user,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		user = sc.next();
		
		if(userData.containsKey(user)) {
			System.out.println("user Exists...");
			System.out.println("Enter Password");
			pwd = sc.next();
			String result = (String)userData.getOrDefault(user, "invalid user");
			System.out.println(result);
			if (pwd.equals(result)) {
				System.out.println("Correct");
			} else {
				System.out.println("Wrong");
			}
			
		} else {
			System.out.println("User Name Does not exists...");
		}

	}
}
