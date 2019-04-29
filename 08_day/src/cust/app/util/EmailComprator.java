package cust.app.util;

import java.util.Comparator;

import cust.app.core.Customer;

public class EmailComprator implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getRegDate().compareTo(o2.getRegDate());
	}
}
