package com.lambda;

public class Adder implements Computable {

	@Override
	public double compute(double a, double b) {
		System.out.println("In ADDER fun");
		return a + b;
	}

}
