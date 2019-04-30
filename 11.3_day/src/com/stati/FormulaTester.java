package com.stati;

public class FormulaTester {

	public static void main(String[] args) {
		Formula f = new MyFormula();
		System.out.println(f.calculate(10));
		//System.out.println(f.getClass().getName());
		
		System.out.println();
		System.out.println(Formula.add(10,20));
		
		System.out.println();
		System.out.println(((MyFormula)f).add(10, 20));
		
	}

}
