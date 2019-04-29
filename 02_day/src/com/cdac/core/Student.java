package com.cdac.core;

public class Student 
{
	private static int idCounter;
	private int id;
	private String name;
	private String email;
	private int age;
	private double gpa;

	public Student(String name,String email,int age,double gpa){
		this.id=++idCounter;
		this.name=name;
		this.email=email;
		this.age=age;
		this.gpa=gpa;
	}
	public Student(String name,String email,int age){
		this.id=++idCounter;
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public String getStudentDetails(){
		return "\nId: "+id
			+" \nName: "+name
			+" \nEmail: "+email
			+" \nAge: "+age
			+" \ngpa: "+gpa;
	}
	public double computeGPA(int quix,int test,int assignment){
		double temp=(test*0.2)+(test*0.5)+(assignment*0.3);
		gpa=temp;
		return temp;
	}
	public double getGPA(){
		return gpa;
	}
}
