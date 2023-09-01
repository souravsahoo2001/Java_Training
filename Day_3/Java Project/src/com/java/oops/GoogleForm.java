package com.java.oops;

public class GoogleForm {

	public void mcqTest(String name){
		System.out.println("For Student " +name+ "Exam Initiated");
	}
	public void questions(){
		System.out.println("Max 25 questions can be uploaded");
	}
	 private String name;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
