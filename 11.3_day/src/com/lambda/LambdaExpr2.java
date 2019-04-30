package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpr2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		List<Integer> l = Arrays.asList(10, 20, 10, 5, 50, 2, 70, 1);
		List<Integer> l2 = Arrays.asList(10, 20, 10, 5, 50, 2, 70, 1);
		System.out.println(l);
		l.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("Sorted lis inner class: ");
		System.out.println(l);

		System.out.println("Sort by Lambda; ");
		Comparator<Integer> c = (a, b) -> a.compareTo(b);
		// Collections.sort(l2,c);
		l2.sort((a, b) -> a.compareTo(b));
		System.out.println(l2);

		System.out.println("Sort desc by lambda: ");
		l2.sort((a, b) -> b.compareTo(a));
		System.out.println(l2);

	}

}
