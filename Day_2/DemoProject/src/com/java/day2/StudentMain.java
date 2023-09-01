package com.java.day2;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentid = 1;
		student.name = "Sourav";
		student.course = Course.JAVA;
		student.cgp = 8.9;
		System.out.println("Student Id " +student.studentid);
		System.out.println("Student Name "+student.name);
		System.out.println("Course "+student.course);
		System.out.println("Cgp "+student.cgp);
	}
}
