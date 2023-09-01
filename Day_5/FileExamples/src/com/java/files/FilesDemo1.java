package com.java.files;

import java.io.File;

public class FilesDemo1 {
	public static void main(String[] args) {
		File f1 = new File("D:/InfiniteJava/Day_5/EmployProject/src/com/java/employ/Employ.java");
		System.out.println("File Name "+f1.getName());
		System.out.println("Parent "+f1.getParent());
		System.out.println("Path "+f1.getPath());
	}

}
