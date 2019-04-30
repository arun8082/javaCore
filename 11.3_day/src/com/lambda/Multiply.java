package com.lambda;

public class Multiply implements Computable {

	@Override
	public double compute(double a, double b) {
		System.out.println("In Multiply");
		return a*b;
	}

}
