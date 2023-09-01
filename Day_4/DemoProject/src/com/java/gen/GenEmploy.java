package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Arnab", 87484));
		employList.add(new Employ(2, "Ganesh", 88479));
		employList.add(new Employ(3, "Rajesh", 84844));
		employList.add(new Employ(4, "Sireesha", 89474));
		employList.add(new Employ(5, "Pallavi", 73673));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
