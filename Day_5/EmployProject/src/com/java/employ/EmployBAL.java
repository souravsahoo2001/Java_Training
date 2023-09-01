package com.java.employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class EmployBAL {

	static StringBuilder sb;
	static EmployDAO dao;
	static{
		sb = new StringBuilder();
		dao = new EmployDaoImpl();
	}
	
	public String readEmployFileBal() throws FileNotFoundException, ClassNotFoundException, IOException{
		return dao.readEmployFileDao();
	}
	public String writeEmployFileBal() throws IOException{
		return dao.writeEmployFileDao();
	}
	public String updateEmployBal(Employ employUpdated) throws EmployException{
		if (validateEmploy(employUpdated)==true){
			return dao.updateEmployDao(employUpdated);
		}
		throw new EmployException(sb.toString());
	}
	public String deleteEmployBal(int empno){
		return dao.deleteEmployDao(empno);
	}
	public Employ searchEmployBal(int empno){
		return dao.searchEmployDao(empno);
	}
	public List<Employ> showEmployBal(){
		return dao.showEmployDao();
	}
	public String addEmployBal(Employ employ) throws EmployException{
		if (validateEmploy(employ)== true){
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	public boolean validateEmploy(Employ employ){
		boolean flag = true;
		if (employ.getEmpno() <= 0){
			flag = false;
			sb.append("Employ No can not be Zero or Negative...\r\n");
		}
		if (employ.getName().length() < 5){
			flag = false;
			sb.append("Name Contains min 5 Characters...\r\n");
		}
		if (employ.getDept().length() < 3){
			flag = false;
			sb.append("Department contains min 3 Characters...\r\n");
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 80000){
			flag = false;
			sb.append("Basic must be between 10000 to 80000...\r\n");
			
		}
		return flag;
	}
}
