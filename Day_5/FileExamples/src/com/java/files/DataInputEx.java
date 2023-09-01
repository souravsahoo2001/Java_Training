package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputEx {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:/Files/data.txt");
			DataInputStream din = new DataInputStream(fin);
			System.out.println("X value is "+din.readInt());
			System.out.println("Name is "+din.readUTF());
			System.out.println("Basic is "+din.readDouble());
			System.out.println("Boolean value is "+din.readBoolean());
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
