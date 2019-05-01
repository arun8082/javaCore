package com.stream;

import static hm.lambda.util.TestData.*;

import java.util.List;

import hm.lambda.core.Employee;

public class ListFilterAndAvg {

	public static void main(String[] args) {
		List<Employee> list = populateList();
		System.out.println("Filter by dept and count: ");
		int count = (int) list.stream().filter(e -> e.getDept().equals("prod")).count();
		int count1 = (int) list.stream().filter(e -> e.getDept().equals("rnd")).count();
		System.out.println("prod: " + count);
		System.out.println("rnd: " + count1);

		System.out.println("\nFilter by dept and calculate avg: ");
		System.out.println(list.stream().filter(e -> e.getDept().equals("rnd")).mapToDouble(e -> e.getSalary()).average().getAsDouble());
	}

}
