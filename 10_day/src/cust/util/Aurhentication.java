package cust.util;

import java.util.Map;

import cust.app.core.Customer;
import cust.app.custExc.CustomerHandlingException;

public class Aurhentication {
	public static Customer athenticateCustomer(Map<Integer,Customer> map,int custId,String password) throws CustomerHandlingException{
		Customer c=map.get(custId);
		if(c==null) {
			throw new CustomerHandlingException("Invalid customer ID");
		}
		if(!c.getPassword().equals(password)) {
			throw new CustomerHandlingException("Invalid password");
		}
		return c;
	}
}
