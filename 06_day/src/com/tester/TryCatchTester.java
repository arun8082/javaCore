package com.tester;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TryCatchTester {
	public static DateTimeFormatter dtf;
	static {
		dtf = DateTimeFormatter.ofPattern("d-M-yyyy");
	}

	public static void main(String[] args) throws Exception {
		String emailRegex = "[a-z0-9]+@[a-z]{3,6}.[a-z]{2,4}";
		String test = "arun1996@gmail.com";
		System.out.println(test.matches(emailRegex));
		System.out.println("djcnj");

		/*
		 * TryCatchTester t = new TryCatchTester(); System.out.println(t.m1());
		 * System.out.println(t.getClass().getCanonicalName());
		 * System.out.println(t.getClass().getClassLoader());
		 * System.out.println(t.getClass().getSuperclass());
		 * System.out.println(t.getClass().getDeclaredFields());
		 * System.out.println(t.getClass().getInterfaces());
		 * 
		 */
		/*
		 * String creationDate="12-10-2019"; LocalDate
		 * ld=LocalDate.parse(creationDate, dtf); String s=ld.format(dtf);
		 * //LocalDate l1=LocalDate.parse(s,dtf);
		 * System.out.println(LocalDate.parse(s,dtf));
		 */
		/*
		 * if (dept.indexOf("Sales") !=0 && dept.indexOf("HR") ==-1 &&
		 * dept.indexOf("MGR") ==-1 && dept.indexOf("Marketing") ==-1) {
		 * System.out.println("success1"); }
		 * 
		 * if (dept.indexOf("Sales") ==-1 && dept.indexOf("HR") !=0 &&
		 * dept.indexOf("MGR") ==-1 && dept.indexOf("Marketing") ==-1) {
		 * System.out.println("success2");
		 * 
		 * } if (dept.indexOf("Sales") ==-1 && dept.indexOf("HR") ==-1 &&
		 * dept.indexOf("MGR") !=0 && dept.indexOf("Marketing") ==-1) {
		 * System.out.println("success3");
		 * 
		 * } if (dept.indexOf("Sales") ==-1 && dept.indexOf("HR") ==-1 &&
		 * dept.indexOf("MGR") ==-1 && dept.indexOf("Marketing") !=0) {
		 * System.out.println("success4");
		 * 
		 * } if (dept.indexOf("Sales") ==-1 && dept.indexOf("HR") ==-1 &&
		 * dept.indexOf("MGR") ==-1 && dept.indexOf("Marketing") ==-1) {
		 * System.out.println("success5");
		 * 
		 * }
		 * 
		 * System.out.println("final");
		 */
	}

	@SuppressWarnings({ "unused", "finally" })
	int m1() {
		String s1 = "abc";
		String s2 = null;
		int a = 10;
		int c = 0;
		byte[] b = { 1, 2, 3, 4, 5 };
		System.out.println(s1);
		try {
			// System.out.println(s2.toCharArray());
			// System.out.println(a / c);
			// System.out.println(b[10]);
			return 10;
		} catch (NullPointerException e) {
			System.out.println("NPE");
			return 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB");
			return 30;
		} catch (ArithmeticException e) {
			System.out.println("AE");
			return 40;
		} catch (Exception e) {
			System.out.println("All exception");
			return 50;
		} finally {
			System.out.println("Final block");
			return 60;
		}
	}
}
