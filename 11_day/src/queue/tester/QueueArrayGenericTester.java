package queue.tester;

import java.util.Scanner;

import queue.app.core.QueueArrayGeneric;

public class QueueArrayGenericTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			QueueArrayGeneric<Double> queue = new QueueArrayGeneric<Double>();
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
						queue.push(sc.nextDouble());
						System.out.println("Data pushed.");
						break;
					case 2: // pop
						System.out.println("Poped data: " + queue.pop());
						break;
					case 3: // peep
						System.out.println("Top data is: " + queue.peep());
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
