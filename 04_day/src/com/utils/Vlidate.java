package com.utils;

public class Vlidate {
	public static void validateEmail(String email) throws Exception {
		if (email.length() < 5 || email.length() > 10) {
			throw new CustomExc("Email id must be 5-10 charcter long");
		} else if (email.indexOf('@') == -1) {
			throw new CustomExc("Email Id must have @ character");
		}
	}

	public static void validateBasicSal(double basic) throws Exception {
		if (0 == (int) basic % 1000) {
			throw new CustomExc("Basic salary must be multiple of 1000");
		}
	}

	public static void validateDept(String dept) throws Exception {

		if (dept.indexOf("Sales") != 0 && dept.indexOf("HR") == -1 && dept.indexOf("MGR") == -1 && dept.indexOf("Marketing") == -1) {
			throw new CustomExc("Dept Id must be like(Sales/Hr/RND/Marketing)");
		}

		if (dept.indexOf("Sales") == -1 && dept.indexOf("HR") != 0 && dept.indexOf("MGR") == -1 && dept.indexOf("Marketing") == -1) {
			throw new CustomExc("Dept Id must be like(Sales/Hr/RND/Marketing)");

		}
		if (dept.indexOf("Sales") == -1 && dept.indexOf("HR") == -1 && dept.indexOf("MGR") != 0 && dept.indexOf("Marketing") == -1) {
			throw new CustomExc("Dept Id must be like(Sales/Hr/RND/Marketing)");

		}
		if (dept.indexOf("Sales") == -1 && dept.indexOf("HR") == -1 && dept.indexOf("MGR") == -1 && dept.indexOf("Marketing") != 0) {
			throw new CustomExc("Dept Id must be like(Sales/Hr/RND/Marketing)");

		}
		if (dept.indexOf("Sales") == -1 && dept.indexOf("HR") == -1 && dept.indexOf("MGR") == -1 && dept.indexOf("Marketing") == -1) {
			throw new CustomExc("Dept Id must be like(Sales/Hr/RND/Marketing)");

		}
	}
}
