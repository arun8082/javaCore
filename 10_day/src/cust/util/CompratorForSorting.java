package cust.util;

import java.util.Comparator;

import cust.app.core.Customer;

public class CompratorForSorting implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return ((Double)o1.getAmount()).compareTo(o2.getAmount());
	}

}
