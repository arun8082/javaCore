package bacc.app.core;

import java.time.LocalDate;

public class BankAccount {
	private int acct_no;
	private String name;
	private AccType accType;
	private double balance;
	private LocalDate creationDate;
	public BankAccount(int acct_no, String name, AccType accType, double balance, LocalDate creationDate) {
		super();
		this.acct_no = acct_no;
		this.name = name;
		this.accType = accType;
		this.balance = balance;
		this.creationDate = creationDate;
	}
	
	public BankAccount(int acct_no) {
		this.acct_no = acct_no;
	}

	@Override
	public String toString() {
		return "BankAccount acct_no=" + acct_no + ", name=" + name + ", accType=" + accType + ", balance=" + balance + ", creationDate=" + creationDate ;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof BankAccount) {
			return acct_no==((BankAccount)o).acct_no;
		}
		return false;
	}
}
