package com.lambda;

public class Utils {
	public static double testCompute(double a,double b,Computable ref) {//p1,p2,Action
		return ref.compute(a, b);
	}
}
