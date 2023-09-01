package com.java.day_4;

public class Student {

	private int studentId;
	private String name;
	private String city;
	private double cgp;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, String city, double cgp) {
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
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgp() {
		return cgp;
	}
	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	
}
