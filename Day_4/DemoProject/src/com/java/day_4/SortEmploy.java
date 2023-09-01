package com.java.day_4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		
		employs.add(new Employ(1,"Arnab",48479));
		employs.add(new Employ(2,"Ganesh",48735));
		employs.add(new Employ(3,"sagar",86374));
		employs.add(new Employ(4,"Pallavi",76273));
		employs.add(new Employ(5,"Nabin",65737));
		employs.add(new Employ(6,"rahul",87627));
		System.out.println("Sorted data ");
		for (Object object : employs){
			Employ employ = (Employ)object;
			System.out.println(object);
		}
	}
}
