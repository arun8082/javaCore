package com.tester;

import static com.utils.Validate.*;

public class CustomExcTester {
	public static void main(String[] args){
		try {
			m2(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
