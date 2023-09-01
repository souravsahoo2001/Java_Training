package com.java.prop;

public class ReadWrite {

	public static void main(String[] args) {
		
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Sourav");
		employ.setBasic(77465);
		
		System.out.println("Employ No " +employ.getEmpno());
		System.out.println("Employ Name " +employ.getName());
		System.out.println("Basic " +employ.getBasic());
		
		
	}
	
}
