package com.app.core;

import java.time.LocalDate;

import static com.app.util.Validate.*;

public class BankAccount {
	private int acct_no;
	private String name;
	private AccType accType;
	private double balance;
	private LocalDate creationDate;

	public BankAccount(int acct_no, String name, AccType accType, double balance, LocalDate creationDate) {
		this.acct_no = acct_no;
		this.name = name;
		this.accType = accType;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	public boolean withdraw(double amount) throws Exception {
		validateBalance(balance);
		balance -= amount;
		return true;
	}

	public boolean diposit(double amount) throws Exception {
		balance += amount;
		return true;
	}

	public boolean fundTransfer(BankAccount other, double amount) throws Exception {
		validateBalance(balance);
		balance -= amount;
		other.balance += amount;
		return true;
	}

	public boolean applyInterset(int rate) {
		double si = (rate * balance) / 100;
		balance += si;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount acct_no=" + acct_no + ", name=" + name + ", accType=" + accType + ", balance=" + balance + ", creationDate=" + creationDate.format(dtf);
	}

}
