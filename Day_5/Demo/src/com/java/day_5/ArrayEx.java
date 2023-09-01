package com.java.day_5;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a= new int[] {1,44};
		try {
			a[10] = 88;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Array size is Small...");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
