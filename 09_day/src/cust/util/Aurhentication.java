package cust.util;

import java.util.List;

import cust.app.core.Customer;
import cust.app.cusrExc.CustomerHandlingException;

public class Aurhentication {
	public static Customer athenticateCustomer(List<Customer> l,int custId,String password) throws CustomerHandlingException{
		Customer c=new Customer(custId);
		int index=l.indexOf(c);
		if(index==-1) {
			throw new CustomerHandlingException("Invalid customer ID");
		}
		c=l.get(index);
		if(!c.getPassword().equals(password)) {
			throw new CustomerHandlingException("Invalid password");
		}
		return c;
	}
}
