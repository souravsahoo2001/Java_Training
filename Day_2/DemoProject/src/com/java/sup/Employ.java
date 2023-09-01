package com.java.sup;

public class Employ {

	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic
				+ "]";
	}
	
}
