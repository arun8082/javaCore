package cust.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import cust.app.core.CustType;
import cust.app.core.Customer;
import cust.app.cusrExc.CustomerHandlingException;

public class ValidationRules {
	public static DateTimeFormatter dtf;
	public static int MULTIPLE;
	public static String emailRegex;
	public static String passRegex;
	public static LocalDate endYr;
	public static LocalDate prevYr;

	static {
		dtf = DateTimeFormatter.ofPattern("d-M-yyyy");
		MULTIPLE = 500;
		emailRegex = "[a-z0-9]+@[a-z] {3-4}.[a-z] {3-4}";
		// passRegex = "[a-z]+[@,%,#,&,*][0-9]+";
		passRegex = "[a-z0-9]+";
		endYr = LocalDate.of(LocalDate.now().getYear() + 1, 4, 30);
		prevYr = LocalDate.of(LocalDate.now().getYear() - 1, 4, 30);
	}

	public static String validateEmail(String email) throws CustomerHandlingException {
		if (email.length() < 5 || email.length() > 40) {
			throw new CustomerHandlingException("Email must be 5-40 char long");
		}
		return email;
	}

	public static String validatePassword(String password) throws CustomerHandlingException {
		if (!password.matches(passRegex)) {
			throw new CustomerHandlingException("Password must be like [a-z]+[@,%,#,&,*][0-9]+");
		}
		return password;
	}

	public static double validateBalance(double bal) throws CustomerHandlingException {
		if (bal % MULTIPLE != 0) {
			throw new CustomerHandlingException("Balance must be multiple of 500");
		}
		return bal;
	}

	public static LocalDate validateRegDate(String date) throws CustomerHandlingException {
		LocalDate ld;
		try {
			ld = LocalDate.parse(date, dtf);
			if (ld.isAfter(endYr) || ld.isBefore(prevYr)) {
				throw new CustomerHandlingException("Date must be b/w current financial yaer");
			}
		} catch (IllegalArgumentException e) {
			throw new CustomerHandlingException("Invalid date (d-m-yyyy)");
		}
		return ld;
	}

	public static Customer validateCustomer(List<Customer> customers, int cust_id) throws CustomerHandlingException {
		Customer c = new Customer(cust_id);
		int index = customers.indexOf(c);
		if (index != -1) {
			return customers.get(index);
		} else {
			throw new CustomerHandlingException("Invalid customer _id");
		}
	}

	public static CustType validateCustomerType(String ctype) throws CustomerHandlingException {
		try {
			return CustType.valueOf(ctype.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new CustomerHandlingException("Invalid Customer type");
		}
	}

	public static Customer validateInputs(int custId, String name, String email, String password, double amount, String regDate, String custType,List<Customer> customers) throws CustomerHandlingException {
		checkDuplicate(customers,email);
		Customer c = new Customer(custId, name, validateEmail(email), validatePassword(password), validateBalance(amount), validateRegDate(regDate), validateCustomerType(custType));		
		return c;
	}
	public static boolean checkDuplicate(List<Customer> customers,String email) throws CustomerHandlingException{
		Customer c = new Customer(email);
		for(Customer o: customers) {
			if(o.getEmail().equals(c.getEmail())) {
				throw new CustomerHandlingException("Email is already exist");
			}
		}
		return false;
	}
}
