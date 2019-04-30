package com.def;

public interface Formula {
	double calculate(double a);

	default double sqrt(double b) {
		System.out.println("In Formula sqrt function");
		return b * b;
	}
}
