package com.java.day_5;

import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if (age<18){
			throw new VotingException("You are not Authorized to voting...");
		}
		System.out.println("You can Vote...");
	}
	public static void main(String[] args) {
		
			int age;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your age ");
			age = sc.nextInt();
			Voting obj = new Voting();
			try {
				obj.check(age);
			} catch (VotingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

