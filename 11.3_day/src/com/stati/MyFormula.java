package com.stati;

public class MyFormula implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("In Myformula calculate fun");
		return a*2;
	}
	@Override
	public double sqrt(double b) {
		System.out.println("In Myformula sqrt fun");
		return Math.sqrt(b);
	}
	//@Override
	public double add(double a,double b) {
		System.out.println("In MyFunction add fun");
		//Formula.add(a, b);
		return (a+b)*2;
	}
	
}
