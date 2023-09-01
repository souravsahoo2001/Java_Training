package com.java.day2;

public class EmployArray {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Sourav";
		employ1.basic = 8000;
	    
		Employ employ2 = new Employ();
		employ2.empno = 2;
		employ2.name = "Shakti";
		employ2.basic = 90564;
	    
		
		Employ employ3 = new Employ();
		employ3.empno = 3;
		employ3.name = "Raj";
		employ3.basic = 7074;
		
		Employ[] arr = new Employ[] {employ1,employ2,employ3};
		
		for (Employ employ : arr){
			System.out.println(employ);
		}
	    
	}
}
