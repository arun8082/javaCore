package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class lambdaExpr3 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(10, 20, 10, 5, 50, 2, 70, 1);
		List<Integer> l2 = Arrays.asList(10, 20, 10, 5, 50, 2, 70, 1);
		System.out.println("foreach inner class: ");
		l1.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer i) {
				System.out.print(i+"-");
			}
		});
		
		System.out.println("\n\nForeach lambda expr: ");
		l1.forEach((i)->System.out.print(i+"_"));

	}

}
