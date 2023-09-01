package com.java.intf;

public class MultInh implements IOne, ITwo {

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("Email is infinite@gmail.com");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name is Inifinite...");
		
	}
	public static void main(String[] args) {
		MultInh obj = new MultInh();
		obj.name();
		obj.email();
	}

	
}
