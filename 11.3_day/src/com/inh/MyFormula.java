package com.inh;

public class MyFormula implements Formula1, Formula2 {

	@Override
	public double calculate(double a) {
		System.out.println("In Myformula calculate fun");
		return a * 10;
	}

	// In case of multiple inheritance we must have to implement default method
	// of all the implementing class
	@Override
	public double sqrt(double b) {
		System.out.println("In Myformula sqrt fun");
		Formula1.add(10, 20);// static fun call
		Formula1.super.sqrt(30);// default fun1 of 1st
		Formula1.super.sqrt(5);// default fun of 2nd
		return b * 20;
	}

	// @Override
	static double add(double a, double b) {
		System.out.println("In Myformula add fun");
		return a + b;
	}

}
