package com.java.cons;

public class StExample {

	int count;
	public void increment(){
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StExample obj1 = new StExample();
		StExample obj2 = new StExample();
		StExample obj3 = new StExample();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	
		}
}
