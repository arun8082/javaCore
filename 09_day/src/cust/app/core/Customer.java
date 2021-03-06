package cust.app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cust.app.cusrExc.CustomerHandlingException;

import static cust.util.ValidationRules.*;

public class Customer implements Comparable<Customer>{
	private int custId;
	private String name;
	private String email;
	private String password;
	private double amount;
	private LocalDate regDate;
	private CustType custType;

	public Customer(int custId, String name, String email, String password, double amount, LocalDate regDate, CustType custType) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.amount = amount;
		this.regDate = regDate;
		this.custType = custType;
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		return true;
	}
	
	public boolean widthdrawAmount(double amt) throws CustomerHandlingException{
		validateBalance(amount-amt);
		amount -= amt;
		return true;
	}
	
	public boolean dipositAmount(double amt){
		amount += amt;
		return true;
	}

	public boolean transferFund(Customer dest,double amt) throws CustomerHandlingException{ 
		validateBalance(amount-amt);
		this.widthdrawAmount(amt);
		dest.dipositAmount(amt);
		return true;
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


	public CustType getCustType() {
		return custType;
	}


	public Customer(int custId) {
		super();
		this.custId = custId;
	}

	@Override
	public String toString() {
		return custId + "\t" + name + "\t" + email + "\t" + password + "\t" + amount + "\t" + regDate + "\t" + custType;
	}

	@Override
	public int compareTo(Customer o) {
		/*if(custId<o.custId)
			return -1;
		else if(custId==o.custId)
			return 0;*/
		return ((Integer)custId).compareTo(o.custId);
	}
	public static void displayAll(List <Customer> customers) {
		System.out.println("Customers summary:\n");
		System.out.println("Custid\tName \tEmail\tPassword\tAmount\t\tRegDate\tCustType\n");
		Iterator<Customer> itr = customers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
	public boolean changePassword(String newPassword) {
		this.password=newPassword;
		return true;
	}
	public static List<Customer> filterByDate(List <Customer> customers,LocalDate afterDate){
		ArrayList<Customer> newList=new ArrayList<>();
		Iterator<Customer> itr = customers.iterator();
		while(itr.hasNext()) {
			Customer temp=itr.next();
			if(temp.getRegDate().compareTo(afterDate)>0) {
				System.out.println(newList.add(temp));
			}
		}
		return newList; 
	}
}
