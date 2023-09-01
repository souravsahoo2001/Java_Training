package com.java.day1;

public class Max3 {

	public void check(int a,int b,int c ){
	
		int m = a;
		if (m < b){
			m = b;
		}
		if (m < c){
			m = c;
		}
		System.out.println("max "+m);
	}
	public static void main(String[] args) {
		int a,b,c;
		a = 4;
		b = 8;
		c = 9;
		new Max3().check(a, b, c);
	}
	
}
