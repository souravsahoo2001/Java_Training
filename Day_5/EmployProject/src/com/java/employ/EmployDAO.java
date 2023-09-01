package com.java.employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface EmployDAO { //Its a data layer
	List<Employ> showEmployDao();
	String addEmployDao(Employ employ);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
	String writeEmployFileDao() throws IOException;
	String readEmployFileDao() throws FileNotFoundException, IOException, ClassNotFoundException;
	

	
}
