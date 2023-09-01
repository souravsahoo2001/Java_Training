package com.java.gen;

public class Student<T> {

	private int studentId;
	private String name;
	private T city;
	private T cgp;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(T studentId, T name, T city, T cgp) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city="
				+ city + ", cgp=" + cgp + "]";
	}
	
	
}
