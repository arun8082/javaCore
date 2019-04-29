package com.tester;

import java.util.Scanner;

import com.emp.Employee;
import com.emp.EmployeeStack;
import com.emp.Employeed;

public class EmpTester {

	public static void main(String[] args) {
		EmployeeStack emp = new Employee();
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			System.out.println("Menu:");
			System.out.println("1. Fixed stack");
			System.out.println("2. Growable stack");
			System.out.println("3. Add Employee");
			System.out.println("4. Pop Employee");
			System.out.println("5. Peep Employee");
			System.out.println("6. Exit");
			System.out.print("\nPlease enter a valid option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				emp = new Employee();
				break;
			case 2:
				emp = new Employeed();
				break;
			case 3:
				System.out.println(emp.push(new Employeed(101,"arun")));
				break;
			case 4:
				System.out.println(emp.pop());
				break;
			case 5:
				System.out.println(emp.peep());
				break;
			case 6:
				System.out.println("Thank for using......");
				System.exit(0);
				break;
			default:
				System.out
						.println("Choosed Invalid option. \nTry again...........");
			}
			System.out.print("\nAre you want to continue(y/n): ");
			ch = sc.next().charAt(0);
		}
		if (sc != null) {
			sc.close();
		}
	}

}
