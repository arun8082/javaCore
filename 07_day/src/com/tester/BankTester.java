package com.tester;

import com.app.core.BankAccount;
import static com.app.util.Validate.*;

import java.util.Scanner;

public class BankTester {
	public static void main(String[] args) {

		/*int acct_no;
		String name;
		String accType;
		double balance;
		String creationDate;*/
		Scanner sc = new Scanner(System.in);
		BankAccount b1=null;
		System.out.println("acc,name,acctype,balance,creationdate");
		try {
			b1 = new BankAccount(sc.nextInt(), sc.next(), validateAccountType(sc.next()), validateBalance(sc.nextDouble()), validateCreationDate(sc.next()));
			System.out.println(b1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null)
				sc.close();
		}
	}
}
