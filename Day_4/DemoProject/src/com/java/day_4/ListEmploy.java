package com.java.day_4;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1,"Arnab",87847));
		employList.add(new Employ(2,"Ganesh",578378));
		employList.add(new Employ(3,"Rajesh",84793));
		employList.add(new Employ(4, "Pallavi",93875));
		System.out.println("Employ List ");
		for(Object object : employList){
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
