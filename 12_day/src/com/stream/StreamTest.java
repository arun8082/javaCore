package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 20, 7, 1, 4, 15, 23);
		// retrieve list using for each
		System.out.println("Stream(): ");
		list.stream().forEach(i -> System.out.print(i + " "));

		System.out.println("\nParallelStream(): ");
		list.parallelStream().forEach(i -> System.out.print(i + " "));

		// filter and display
		System.out.println("\nFilter i>9 and display: ");
		list.stream().filter(i -> i > 9).forEach(i -> System.out.print(i + " "));

		System.out.println("\nArray stream and display: ");
		int[] arr = { 10, 15, 7, 20, 3, 80, 12, 10 };
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

		System.out.println("\nArray stream all match: ");
		int[] arr1 = { 11, 20, 30 };
		int[] arr2 = { 11, 20, 30, 1 };
		System.out.println(Arrays.stream(arr1).allMatch(i -> i > 10));
		System.out.println(Arrays.stream(arr2).allMatch(i -> i > 10));
		
		System.out.println("\nRange and sum stream: ");
		int sum=IntStream.range(1, 10).sum();
		System.out.println(sum);

		System.out.println("\nRange and avg and orElse stream: ");
		double avg=IntStream.range(100, 1).average().orElse(-123);
		System.out.println(avg);
		
		System.out.println("\nRange and avg getASDouble stream: ");
		double avg1=IntStream.range(1, 10).average().getAsDouble();
		System.out.println(avg1);
		
	}

}
