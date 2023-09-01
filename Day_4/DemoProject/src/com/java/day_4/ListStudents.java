package com.java.day_4;

import java.util.ArrayList;
import java.util.List;

public class ListStudents {

	public static void main(String[] args) {
		List studentList = new ArrayList();
		studentList.add(new Student(35,"Sourav","Paradeep",8.9));
		studentList.add(new Student(64,"Banty","Paradeep",9.9));
		studentList.add(new Student(87,"Prakash","Paradeep",6.4));
		studentList.add(new Student(83,"Abinash","Paradeep",7.9));
		
		for (Object object : studentList ){
			Student student = (Student) object;
			System.out.println(object);
		}
		
		
	}
}
