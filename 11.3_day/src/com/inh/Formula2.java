package com.inh;

public interface Formula2 {
	double calculate(double a);

	default double sqrt(double b) {
		System.out.println("In default fun of formula2");
		return b * b;
	}

	static double add(double a, double b) {
		System.out.println("In formula2 add fun");
		return a + b;
	}
}
