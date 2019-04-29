package cust.app.core;

import java.time.LocalDate;
import cust.app.cusrExc.CustomerHandlingException;

import static cust.app.util.ValidationRules.*;

public class Customer implements Comparable<Customer> {
	private int custId;
	private String name;
	private String email;
	private String password;
	private double amount;
	private LocalDate regDate;
	public static int idCounter;
	static {
		idCounter = 100;
	}

	// Constructor for system geneerated cust id
	public Customer(String name, String email, String password, double amount, LocalDate regDate) {
		this.custId = idCounter++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.amount = amount;
		this.regDate = regDate;
	}

	// Constructor for system user defined cust id
	public Customer(int custId, String name, String email, String password, double amount, LocalDate regDate) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.amount = amount;
		this.regDate = regDate;
	}

	public Customer(int custId) {
		super();
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer custId=" + custId + ", name=" + name + ", email=" + email + ", password=" + password + ", amount=" + amount + ", regDate=" + regDate;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
			return custId == ((Customer) o).custId;
		}
		return false;
	}

	public void withdrawl(double amt) {
		amount -= amt;
	}

	public void diposit(double amt) {
		amount += amt;
	}

	public boolean transferFund(Customer dest, double amt) throws CustomerHandlingException {
		validateBalance(amount - amt);
		this.withdrawl(amt);
		dest.diposit(amt);
		return true;
	}

	@Override
	public int compareTo(Customer o) {
		if (custId < o.custId) {
			return -1;
		} else if (custId > o.custId) {
			return 1;
		}
		return 0;
	}

	public int getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public static int getIdCounter() {
		return idCounter;
	}
	public boolean applyInterest(int rate) {
		this.amount+=((amount*rate)/100);
		return true;
	}
}
