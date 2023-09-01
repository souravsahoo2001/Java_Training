package com.java.prop;

public class PropEx {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Abhisek");
		
		
		System.out.println("Customer Id " +customer.getCustId());
		System.out.println("customer Name " +customer.getName());
		System.out.println(customer);
		
		
	}

}
