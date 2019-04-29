package bacc.tester;

import static bacc.app.util.AccountValidation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import bacc.app.core.AccType;
import bacc.app.core.BankAccount;

public class BankTesterArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		try {

			boolean exit = false;
			while (!exit) {
				System.out.println("Menu:");
				System.out.println("1. Add account");
				System.out.println("2. Display All Accounts");
				System.out.println("3. Display specific Acc details");
				System.out.println("10.Exit");
				System.out.print("Choose valid op: ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter details acno,name,acTy,bal,date: ");
						int acct_no = sc.nextInt();
						String name = sc.next();
						AccType accType = validateAccType(sc.next());
						Double balance = validateBalance(sc.nextDouble());
						LocalDate creationDate = validateDate(sc.next());
						BankAccount a = new BankAccount(acct_no, name, accType, balance, creationDate);
						accounts.add(a);
						System.out.println("Account added");
						break;

					case 2:
						for (BankAccount b : accounts) {
							System.out.println(b);
						}
						break;
					case 3:
						System.out.print("Enter acc no: ");
						BankAccount b = new BankAccount(sc.nextInt());
						int index = accounts.indexOf(b);
						if (index!=-1) {
							System.out.println(accounts.get(index));
						} else {
							System.out.println("Not");
						}
						break;
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