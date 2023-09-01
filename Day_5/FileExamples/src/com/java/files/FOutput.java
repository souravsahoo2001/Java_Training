package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

	public static void main(String[] args) {
		try {
			//FileInputStream 
			FileInputStream src = new FileInputStream("D:/Files/Employ.txt");
			FileOutputStream tar = new FileOutputStream("D:/Files/copy.txt");
			int ch;
			while((ch = src.read()) != -1){
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("***File Copied***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
