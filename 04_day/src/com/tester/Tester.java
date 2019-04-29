package com.tester;

import java.util.Scanner;
import static com.utils.Vlidate.*;

import com.emp.Emp;
import com.emp.Mgr;
import com.emp.Worker;

public class Tester {
	public static void main(String[] args) {
		int idCounter = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\nHow many Records you want to inster: ");
		int noOfRecords = 4;// scan.nextInt();
		Emp eData[] = new Emp[noOfRecords];

		// eData = TestData.data();
		// idCounter = 4;

		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			System.out.println("Menu lis:");
			System.out.println("1. Add Mgr");
			System.out.println("2. Add Worker");
			System.out.println("3. Display All");
			System.out.println("4. Performance Only");
			System.out.println("5. Fire");
			System.out.println("6. Update salary");
			System.out.println("7. exit");
			System.out.print("\nPlease choose valid option: ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if (idCounter > noOfRecords) {
					System.out.println("Emp records are full\n");
					break;
				}
				String name = null;
				String email = null;
				String deptId = null;
				double basic = 0;
				double perfBounus = 0;

				// name = scan.next();
				while (true) {
					// email = scan.next();

					try {
						validateEmail(email);
						break;
					} catch (Exception e) {
						break;
						// System.out.println(e.getMessage());
					}
				}
				while (true) {
					deptId = scan.next();
					try {
						validateDept(deptId);
						break;
					} catch (Exception e) {

						System.out.println(e.getMessage());
					}
				}
				while (true) {
					basic = scan.nextDouble();
					try {
						validateBasicSal(basic);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}

				perfBounus = scan.nextDouble();

				eData[idCounter++] = new Mgr(name, email, deptId, basic, perfBounus);
				// System.out.println(eData[idCounter] + " " + idCounter);
				break;
			case 2:
				if (idCounter > noOfRecords) {
					System.out.println("Emp records are full\n");
					break;
				}
				eData[idCounter++] = new Worker(scan.next(), scan.next(), scan.next(), scan.nextDouble(), scan.nextInt(), scan.nextDouble());
				break;
			case 3:
				System.out.println("\nEmployees Details are: \n");

				for (Emp e : eData) {
					if (e == null) {
						continue;
					}
					System.out.print(e);
					if (e instanceof Mgr) {
						System.out.println(" " + ((Mgr) e).getPerformanceBonus());
					} else if (e instanceof Worker) {
						System.out.println(" " + ((Worker) e).getPerformanceBonus());
					}
					System.out.println();
				}

				break;
			case 4:
				// Specific employee details
				System.out.print("Enter EmpID: ");
				int empId = scan.nextInt();

				int index = empId - 100 - 1;// to get index no.

				if (index < 0 || index > idCounter) {
					System.out.println("Invalid emp id");
				} else {
					System.out.println("Performance details: \n");
					if (eData[index] instanceof Mgr) {
						System.out.println(((Mgr) eData[index]).getPerformanceBonus());
					} else if (eData[index] instanceof Worker) {
						System.out.println(((Worker) eData[index]).getPerformanceBonus());
					}
					System.out.println();
				}
				break;
			case 5:
				// fire employee
				System.out.print("Enter EmpID: ");
				empId = scan.nextInt();

				index = empId - 100 - 1;// to get index no.

				if (index < 0 || index > idCounter) {
					System.out.println("Invalid emp id");
				} else {
					if (eData[index] != null) {
						if (eData[index] instanceof Mgr) {
							name = eData[index].getName();
							eData[index] = null;
							System.out.println("Emp: " + name + "( " + empId + " ) is deleted");
						} else if (eData[index] instanceof Worker) {
							name = eData[index].getName();
							eData[index] = null;
							System.out.println("Emp: " + name + "( " + empId + " ) is deleted");
						}
					} else {
						System.out.println("Already deleted");
					}
					System.out.println();
				}
				break;
			case 6:
				// increase salary
				System.out.print("Enter EmpID: ");
				empId = scan.nextInt();

				index = empId - 100 - 1;// to get index no.

				if (index < 0 || index > idCounter) {
					System.out.println("Invalid emp id");
				} else {
					if (eData[index] != null) {
						System.out.println("Old salary: " + eData[index].getBasic());
						System.out.print("Enter new salary: ");
						double newBasic = scan.nextDouble();

						eData[index].setBasic(newBasic);
						System.out.println("Salary is updated");
					} else {
						System.out.println("Emp id does not exist");
					}
					System.out.println();
				}
				break;
			case 7:
				System.out.println("Thank you.........");
				System.exit(0);
				break;
			default:
				System.out.println("Choosed invalid option!!!!!!!\n");
			}
			System.out.print("Are you want to continue(y/n): ");
			ch = scan.next().charAt(0);
		}
		if (scan != null) {
			scan.close();
		}
	}
}
