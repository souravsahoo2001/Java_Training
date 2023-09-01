package com.java.day_5;

import java.util.Scanner;

public class Email {
	public void check(String email) throws LengthException, AtTheRateException{
		if (email.indexOf('@')< 9){
			throw new LengthException("Invalid Length of Username...");
		}else if(!email.contains("@")){
			throw new AtTheRateException("No @ is there...");
		}
		else{
			System.out.println("Your Email is "+email);
		}
		
	}
	public static void main(String[] args) {
		
		char[] arr = "Hello World".toCharArray();
		for (char c : arr) {
			
		}
		String email;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Email ");
		email = sc.next();
		
		
		
		Email obj = new Email();
		try {
			obj.check( email);
		} catch (LengthException | AtTheRateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
