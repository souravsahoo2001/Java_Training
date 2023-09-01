package com.java.day_4;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object o2, Object o1) {
		Employ e1 = (Employ)o1;
		Employ e2 = (Employ)o2;
		return e1.getName().compareTo(e2.getName());
	}

	
}
