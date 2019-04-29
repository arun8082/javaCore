package com.emp;

public class Employee implements EmployeeStack{
	
	private int id;
	private String name;
	private static int top;
	private static EmployeeStack[] emp;
	private static final int SIZE = 3;

	//Constructor
	public Employee() {
		top = -1;
		emp = new Employee[SIZE];
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//To add employee
	public boolean push(EmployeeStack e) {
		if (top + 1 < SIZE) {
			emp[++top] = e;
			return true;
		}
		return false;
	}
	
	//to delete employee
	public EmployeeStack pop(){
		if(top !=-1){
			EmployeeStack temp=emp[top];
			emp[top]=null;
			top--;
			return temp;
		}
		return null;
	}
	
	//to retrieve top element
	public EmployeeStack peep(){
		if(top!=-1){
			return emp[top];
		}
		return null;
	}

	@Override
	public String toString() {
		return "id: "+id
				+" Name: "+name;
	}

}
