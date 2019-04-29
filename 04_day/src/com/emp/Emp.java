package com.emp;

public abstract class Emp {
	public static int idCounter;
	private int id;
	private String name;
	private String email;
	private String deptId;
	private double basic;
	//Initialize the idCounter
	static{
		idCounter=100;
	}
	//Constructor to initialize the data
	public Emp(String name,String email,String deptId,double basic){
		this.id=++idCounter;
		this.name=name;
		this.email=email;
		this.deptId=deptId;
		this.basic=basic;
	}
	@Override
	public String toString(){
		return "Emp: "+id
				+" "+name
				+" "+email
				+" "+deptId
				+" "+basic;
	}
	public abstract double netSalary();
	public double getBasic(){
		return basic;
	}
	public String getName(){
		return name;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
}
