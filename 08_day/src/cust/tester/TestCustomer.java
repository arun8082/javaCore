package cust.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import static cust.app.util.ValidationRules.*;

import cust.app.core.Customer;
import cust.app.util.EmailComprator;
import cust.app.util.TestData;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> customers = TestData.populatedData2();// new
																	// ArrayList<Customer>(5);
		try {
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu:");
				System.out.println("1. Add customer");
				System.out.println("2. Display all customers");
				System.out.println("3. View customer details");
				System.out.println("4. Fund transfer");
				System.out.println("5. Sort by cust_id");
				System.out.println("6. Sort by email_id (anonymous class)");
				System.out.println("7. Sort by regDate");
				System.out.println("8. Apply interest");
				System.out.println("9. Remove customer");

				System.out.println("10. Exit");
				System.out.print("Coose a valid option: ");
				try {
					switch (sc.nextInt()) {
					case 1:// add customer
						System.out.println("Enter name,email,passwd,amount,regDate(d-m-yyyy);");
						String name = sc.next();
						String email = validateEmail(sc.next());
						String password = validatePassword(sc.next());
						double amount = validateBalance(sc.nextDouble());
						LocalDate regDate = validateRegDate(sc.next());

						Customer c = new Customer(name, email, password, amount, regDate);
						customers.add(c);
						System.out.println("Added 1 customer");
						break;

					case 2:// Display all customers
						for (Customer c1 : customers) {
							System.out.println(c1);
						}
						break;
					case 3:// view customer details
						System.out.print("Enter customer ID: ");
						Customer c2 = new Customer(sc.nextInt());
						int index = customers.indexOf(c2);
						if (index != -1)
							System.out.println(customers.get(index));
						else
							System.out.println("Customer dos not exist");
						break;
					case 4:// fund transfer
						System.out.print("Enter your cust_id: ");
						Customer source = validateCustomer(customers, sc.nextInt());
						System.out.print("Enter cutomer id destination,amount: ");
						Customer dest = validateCustomer(customers, sc.nextInt());
						source.transferFund(dest, sc.nextDouble());
						System.out.println("Fund transfered.");
						break;
					case 5:// sort by cust_id
							// internal sort
						Collections.sort(customers);
						// System.out.println(customers);
						break;
					case 6:// sort by email_id
						Collections.sort(customers, new Comparator<Customer>() {
							@Override
							// anonyous class
							public int compare(Customer o1, Customer o2) {
								return o1.getEmail().compareTo(o2.getEmail());
							}
						});
						break;
					case 7:// sort by regdate
							// External sort
						EmailComprator ec = new EmailComprator();
						Collections.sort(customers, ec);
						break;
					case 8:// Apply interset
						System.out.print("Enter interest rate: ");
						int rate = sc.nextInt();
						for (Customer a : customers)
							a.applyInterest(rate);
						break;
					case 9://remove customer
						System.out.print("Enter cust_id: ");
						c = validateCustomer(customers, sc.nextInt());
						customers.remove(c);
						System.out.println("account deleted");
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
