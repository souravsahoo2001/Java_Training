package com.java.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {

	public static void main(String[] args) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("D:/Files/data.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(12);
			dout.writeUTF("Infinite");
			dout.writeDouble(13383757.75);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("Data Saved...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
