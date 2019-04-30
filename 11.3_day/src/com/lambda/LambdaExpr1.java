package com.lambda;
import static com.lambda.Utils.testCompute;
public class LambdaExpr1 {

	public static void main(String[] args) {
		System.out.println("Add: "+testCompute(10, 20, new Adder()));//a,b,Computable ref=new Adder();
		System.out.println("Add Lambda: "+testCompute(30,40 , (a,b)->a+b));
		System.out.println();
		System.out.println("Mul: "+testCompute(10, 20, new Multiply()));
		System.out.println("Mul lambda: "+testCompute(30, 40, (a,b)->a*b));
		System.out.println();
		System.out.println("Div: "+testCompute(10, 20, new Computable() {
			
			@Override
			public double compute(double a, double b) {
				System.out.println("Inner class divide");
				return a/b;
			}
		}));
		System.out.println("Div lambda: "+testCompute(30, 40, (c,d)->c/d));
		System.out.println();
		System.out.println("Mod: "+testCompute(10, 20, new Computable() {
			
			@Override
			public double compute(double a, double b) {
				System.out.println("Inner class Mod");
				return a%b;
			}
		}));
		System.out.println("Mod lambda: "+testCompute(30, 40, (e,f)->e%f));
		System.out.println();
		
		
		
	}

}
