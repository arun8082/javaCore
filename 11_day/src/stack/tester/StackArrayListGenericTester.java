package stack.tester;

import java.util.Scanner;

import stack.app.core.StackArrayListGeneric;

public class StackArrayListGenericTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			StackArrayListGeneric <String>stack = new StackArrayListGeneric<String>();
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
						stack.push(sc.next());
						System.out.println("Data pushed.");
						break;
					case 2: // pop
						System.out.println("Poped data: "+stack.pop());
						break;
					case 3: // peep
						System.out.println("Top data is: "+stack.peep());
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
