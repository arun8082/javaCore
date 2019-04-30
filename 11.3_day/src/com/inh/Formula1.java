package com.inh;

public interface Formula1 {
	double calculate(double a);

	default double sqrt(double b) {
		System.out.println("In default fun of formula1");
		return b * b;
	}

	static double add(double a, double b) {
		System.out.println("In formula1 add fun");
		return a + b;
	}
}
