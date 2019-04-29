package cust.tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import static cust.util.ValidationRules.*;
import cust.app.core.Customer;
import cust.app.custExc.CustomerHandlingException;
import cust.util.Aurhentication;
import static cust.util.Aurhentication.athenticateCustomer;

import static cust.util.TestData.populatedData2;

public class CustomerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			boolean exit = false;
			// Map<Integer,Customer> customers = new HashMap<Integer,Customer>();
			Map<Integer,Customer> customers = populatedData2();
			while (!exit) {
				try {
					System.out.println(" 1. Register Customer");
					System.out.println(" 2. Display All customers");
					System.out.println(" 3. Display customer details");
					System.out.println(" 4. Diposite Amount");
					System.out.println(" 5. Withdrawl Amount");
					System.out.println(" 6. Fund Transfer");
					System.out.println(" 7. Un-Subscribe Account");
					System.out.println(" 8. Sort by Customer Id");
					System.out.println(" 9. Sort by Amount");
					System.out.println("10. Sort by creation date");
					System.out.println("11. Sort by name and amount");
					System.out.println("12. Change Password");
					System.out.println("13. (Filter by date)Display Customers After Reg. Date");
					System.out.println("20. Exit");
					System.out.println();
					System.out.print("Please choose a valid option: ");
					switch (sc.nextInt()) {
					case 1:// register customer
						System.out.println("Enter customer details(custId, name, email, password, amount, regDate, custType): ");
						Customer c=validateInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),customers);
						customers.put(c.getCustId(), c);
						System.out.println("Customer added sucessfully");
						break;
					case 2:// display all customer
						System.out.println("Customers summary:\n");
						System.out.println(customers);
						//System.out.println("Custid\tName \tEmail\tPassword\tAmount\t\tRegDate\tCustType\n");
						
						System.out.println();
						break;
					case 3:// display customer details
						System.out.print("Enter customer ID: ");
						//System.out.println("CustId\tName \tEmail\tPassword\tAmount\t\tRegDate\tCustType\n");
						System.out.println(validateCustomer(customers, sc.nextInt()));
						break;
					case 4:// Deposit amount
						System.out.print("Enter customer ID: ");
						c = validateCustomer(customers, sc.nextInt());
						System.out.print("Enter amount: ");
						c.dipositAmount(sc.nextDouble());
						System.out.println("Diposit successfull.");
						break;
					case 5:// Withdrawal amount
						System.out.print("Enter customer ID: ");
						c = validateCustomer(customers, sc.nextInt());
						System.out.print("Enter amount: ");
						c.widthdrawAmount(sc.nextDouble());
						System.out.println("Widthdrawal successfull.");
						break;
					case 6:// fund transfer
						System.out.println("Enter Customer Id(from): ");
						c = validateCustomer(customers, sc.nextInt());
						System.out.print("Enter Customer ID(To),Amount: ");
						Customer dest = validateCustomer(customers, sc.nextInt());
						c.transferFund(dest, sc.nextDouble());
						break;
					case 7:// UN-Subscribe customer
						System.out.print("Enter Customer Id(from): ");
						int cust_id = sc.nextInt();
						c = validateCustomer(customers, cust_id);
						Aurhentication.athenticateCustomer(customers, cust_id, sc.next());
						customers.remove(cust_id);
						System.out.println("Customer Un-Subscribed successfully.");
						break;
					case 8:// Sort by customer Id
						//Collections.sort(customers);
						//Customer.displayAll(customers);
						break;
					case 9:// Sort by Amount
						
						//Customer.displayAll(customers);
						break;
					case 10:// Sort by creation Date
						/*Collections.sort(customers, new Comparator<Customer>() {
							@Override
							public int compare(Customer o1, Customer o2) {
								return o1.getRegDate().compareTo(o2.getRegDate());
							}
						});
						Customer.displayAll(customers);
						*/
						break;
					case 11:// sort by name and amount
						/*Collections.sort(customers, new Comparator<Customer>() {
							@Override
							public int compare(Customer o1, Customer o2) {
								if (o1.getRegDate().compareTo(o2.getRegDate()) == 0) {
									return ((Double) o1.getAmount()).compareTo(o2.getAmount());
								}
								return o1.getRegDate().compareTo(o2.getRegDate());
							}
						});

						Customer.displayAll(customers);*/
						break;
					case 12:// change password
						System.out.print("Enter Customer ID,password: ");
						c = athenticateCustomer(customers, sc.nextInt(), sc.next());
						System.out.print("Enter newPassword: ");
						c.changePassword(sc.next());
						System.out.println("Your password is changed successfully.");
						break;
					case 13:// filter customer by after date
						LocalDate afterDate = LocalDate.parse(sc.next(), dtf);
						Customer.displayAll(Customer.filterByDate(customers, afterDate));
						break;
					case 20:// exit
						System.out.println("thank you for use........");
						exit = true;
						break;
					default:
						System.out.println("Invalid option...........");
						System.out.println("Try again");
					}
					System.out.println("\n-------------------------------------------------\n");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
		} catch (CustomerHandlingException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
