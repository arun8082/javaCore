package com.emp;

public interface EmployeeStack {
	boolean push(EmployeeStack e);
	EmployeeStack pop();
	EmployeeStack peep();
}
