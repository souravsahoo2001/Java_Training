package com.java.oops;

public class Exam {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Abhisek Mukherje");
		
		GoogleForm form = new GoogleForm();
		form.setName(student1.getName());
		form.mcqTest(student1.getName());
		form.questions();
		
		Hackthon hackthon = new Hackthon();
		hackthon.setLanguage(student1.getName());
		hackthon.setLimit();
	}
}
