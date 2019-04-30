package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpr4 {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		List<Integer> l2= new ArrayList<>();
		int[] data= {10, 1, 34, 45, 20, 67, 1};
		for(int i : data) {
			l1.add(i);
			l2.add(i);
			
		}
		l1.forEach(i->System.out.print(i+" "));
		System.out.println("\nRemove even elements by inner calss: ");
		l1.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				return i%2==0;
			}
		});
		l1.forEach(i->System.out.print(i+" "));
		
		System.out.println("\n\nRemove odd elements by lambda expr: ");
		l2.removeIf(i->i%2!=0);
		l2.forEach(i->System.out.print(i+" "));

	}

}
