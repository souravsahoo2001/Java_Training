package com.java.day_5;

import java.util.Scanner;

public class Calculation {
	public void check(int a,int b) throws NegativeException, NumberZeroException{
		if (a<0||b<0){
			throw new NegativeException("Negative Nos are not allowed...");
		}else if(a==0 || b==0){
			throw new NumberZeroException("Zero is Invalid value...");
		}else{
			int c = a + b;
			System.out.println("Valid values...");
			System.out.println("Sum is "+c);
		}
		
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calculation obj = new Calculation();
		try {
			obj.check(a, b);
		}
		
		catch (NegativeException | NumberZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
