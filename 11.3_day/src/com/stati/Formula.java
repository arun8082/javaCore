package com.stati;

public interface Formula {
	double calculate(double a);
	default double sqrt(double b) {
		System.out.println("In default fun of formula");
		return b*b;
	}
	static double add(double a,double b) {
		System.out.println("In formula add fun");
		return a+b;
	}
}
