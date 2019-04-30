package com.def;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("In myformula calculate");
		return 10;
	}
	@Override
	public double sqrt(double b) {
		System.out.println("In Myformula sqrt fun.");
		return --b;
	}

}
