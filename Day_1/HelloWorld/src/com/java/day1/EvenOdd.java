package com.java.day1;

public class EvenOdd {

	public void check(int num){
		if (num % 2 == 0){
			System.out.println("The given number is even");
			
		}else {
			System.out.println("The given number is odd.");
		}
	}
	
	public static void main(String[] args) {
		int num = 29;
		new EvenOdd().check(num);
	}
}
