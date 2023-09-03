package com.java.leave;

import java.util.List;

public interface LeaveDAO {
	
	List<Leave> showLeaveDetailsDAO();
	String addLeaveDetailsDAO(Leave lv);
	Leave searchLeaveApplDAO(int empno);
	String deleteLeaveApplDAO(int empno);
	String updateLeaveApplDAO(Leave lv);
	
	
	

}
