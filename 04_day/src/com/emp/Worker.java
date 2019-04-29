package com.emp;

public class Worker extends Emp{
	private int hoursWorked;
	private double hourlyRate;
	
	public Worker(String name,String email,String dept,double basic,int hoursWorked,double hourlyRate){
		super(name,email,dept,basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	@Override
	public double netSalary(){
		return super.getBasic()+(hourlyRate*hoursWorked);
	}
	@Override
	public String toString(){
		return super.toString()
				+" "+hoursWorked
				+" "+hourlyRate
				+" "+netSalary();
	}
	public double getPerformanceBonus(){
		return hourlyRate;
	}
}
