package com.emp;

public class Employeed implements EmployeeStack{
	
	private int id;
	private String name;
	private static int top;
	private static EmployeeStack[] emp;
	private static int SIZE = 3;

	//Constructor
	public Employeed() {
		top = -1;
		emp = new Employeed[SIZE];
	}

	public Employeed(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//To add employee
	public boolean push(EmployeeStack e) {
		if(top+1==SIZE){
			emp=growStack();
		}
		System.out.println("grow: SIZE: "+SIZE+" top: "+top);
		if (top + 1 < SIZE) {
			emp[++top] = e;
			return true;
		}
		return false;
	}
	//Grow stack size
	private EmployeeStack[] growStack() {
		EmployeeStack[] temp=new Employeed[SIZE*2];
		for(int i=0; i<emp.length; i++){
			temp[i]=emp[i];
		}
		SIZE=SIZE*2;
		System.out.println("grow: SIZE: "+SIZE+" top: "+top);
		return temp;
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
