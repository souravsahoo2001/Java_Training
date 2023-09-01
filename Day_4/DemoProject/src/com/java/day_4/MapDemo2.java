package com.java.day_4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {

	public static void main(String[] args) {
		Map empData = new Hashtable();
		empData.put(1, new Employ(1,"Arnab",88842));
		empData.put(1, new Employ(2,"Ariz",87468));
		empData.put(1, new Employ(3,"rajesh",88942));
		empData.put(1, new Employ(4,"sourav",87932));
		empData.put(1, new Employ(5,"Pallavi",886342));
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ No ");
		empno = sc.nextInt();
		Employ employ = (Employ)empData.getOrDefault(empno,null);
		System.out.println(employ);
	}
}
