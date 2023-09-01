package com.java.gen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;





public class ListStudents {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		Comparator<Student> c = new NameComparator<Student>();
		SortedSet<Student> employs = new TreeSet<Student>(c);
		
		studentList.add(new Student(35,"Sourav","Paradeep",8.9));
		studentList.add(new Student(64,"Banty","Cuttack",9.9));
		studentList.add(new Student(87,"Prakash","Jagatsinghpur",6.4));
		studentList.add(new Student(83,"Abinash","Koraput",7.9));
		
		for (Object object : studentList ){
			Student student = (Student) object;
			System.out.println(object);
		}
	}	
}
