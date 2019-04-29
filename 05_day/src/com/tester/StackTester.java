package com.tester;

import java.util.Scanner;

import com.stack.*;

public class StackTester {

	public static void main(String[] args) {
		Stack stack = null;
		int choosedStack = 0;
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		int i = 100;
		while (ch == 'y' || ch == 'Y') {
			System.out.println("Menu:");
			System.out.println("1. Static Array");
			System.out.println("2. Growable Array");
			System.out.println("3. Push");
			System.out.println("4. Pop");
			System.out.println("5. Peep");
			System.out.println("6. Exit");
			System.out.print("\nEnter a valid option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (choosedStack != 0 && choosedStack != 1) {
					System.out
							.print("Are you want to change stack type(Stackd-->stacks)(y/n): ");
					int confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						stack = new Stacks();
						choosedStack = 1;
						System.out.println("Stacks is created sucessfully");
					}
				} else {
					stack = new Stacks();
					choosedStack = 1;
					System.out.println("Stacks is created sucessfully");
				}
				break;
			case 2:
				if (choosedStack != 0 && choosedStack != 2) {
					System.out
							.print("Are you want to change stack type(Stacks-->stackd)(y/n): ");
					int confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						stack = new Stackd();
						choosedStack = 2;
						System.out.println("Stackd is created sucessfully");
					}
				} else {
					stack = new Stackd();
					choosedStack = 2;
					System.out.println("Stackd is created sucessfully");
				}
				break;
			case 3:
				if (choosedStack != 0) {
					if (!stack.push(++i)) {
						System.out.println("Stack is full");
						break;
					}
					System.out.println("Item is added sucessfully");
				} else {
					System.out.println("Please create stack first");
				}
				break;
			case 4:
				if (choosedStack != 0) {
					int value = stack.pop();
					if (value == 0) {
						System.out.println("Stack is empty");
					} else {
						System.out.println("Poped element: " + value);
					}
				} else {
					System.out.println("Please create stack first");
				}
				break;
			case 5:
				if (choosedStack != 0) {
					int value = stack.peep();
					if (value == 0) {
						System.out.println("Stack is empty");
					} else {
						System.out.println("Poped element: " + value);
					}
				} else {
					System.out.println("Please create stack first");
				}
				break;
			case 6:
				System.out.println("Thank you....");
				System.exit(0);
				break;
			default:
				System.out.println("Choosed invalid option. try again......");
			}
			System.out.print("Are you want to continue(y/n): ");
			ch = sc.next().charAt(0);
		}
		if (sc != null) {
			sc.close();
		}
	}

}
