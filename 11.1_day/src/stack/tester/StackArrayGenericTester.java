package stack.tester;

import java.util.Scanner;

import stack.app.core.StackArrayGeneric;

public class StackArrayGenericTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//StackArrayGeneric<String> stack = new StackArrayGeneric<String>();
			StackArrayGeneric<Double> stack = new StackArrayGeneric<Double>();
			boolean exit = false;
			while (!exit) {

				System.out.println("Menu:");
				System.out.println("1. Push");
				System.out.println("2. POP");
				System.out.println("3. PEEP");
				System.out.println("4. EXIT");
				System.out.print("Enter valid choice: ");
				try {
					switch (sc.nextInt()) {
					case 1:// push
						System.out.print("Enter data: ");
						//stack.push(sc.next());
						stack.push(sc.nextDouble());
						System.out.println("Data pushed.");
						break;
					case 2: // pop
						System.out.println("Poped data: " + stack.pop());
						break;
					case 3: // peep
						System.out.println("Top data is: " + stack.peep());
						break;
					case 4:// exit
						exit = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
