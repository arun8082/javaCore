package cust.util;

import java.util.ArrayList;

import cust.app.core.Customer;
import cust.app.cusrExc.CustomerHandlingException;

import static cust.util.ValidationRules.*;

public class TestData {
	public static ArrayList<Customer> populatedData() throws CustomerHandlingException {
		ArrayList<Customer> l = new ArrayList<>();
		// cust_id,name,email,password,amount,regDate,custType
		l.add(new Customer(101, "arun", validateEmail("arun@mail.com"), validatePassword("pass"), validateBalance(1500), validateRegDate("27-08-2019"), validateCustomerType("gold")));
		l.add(new Customer(11, "aashay", validateEmail("aashay@mail.com"), validatePassword("pass"), validateBalance(20000), validateRegDate("23-02-2019"), validateCustomerType("silver")));
		l.add(new Customer(5, "aniket", validateEmail("aniket@mail.com"), validatePassword("pass"), validateBalance(2500), validateRegDate("27-09-2019"), validateCustomerType("platinum")));
		l.add(new Customer(109, "mayank", validateEmail("mayank@mail.com"), validatePassword("pass"), validateBalance(1000), validateRegDate("27-01-2019"), validateCustomerType("gold")));
		l.add(new Customer(1018, "mayank", validateEmail("mayank@mail.com"), validatePassword("pass"), validateBalance(500), validateRegDate("27-01-2019"), validateCustomerType("gold")));
		l.add(new Customer(103, "barood", validateEmail("barood@mail.com"), validatePassword("pass"), validateBalance(2000), validateRegDate("27-03-2019"), validateCustomerType("silver")));

		return l;
	}
	
	public static ArrayList<Customer> populatedData2() throws CustomerHandlingException {
		ArrayList<Customer> l = new ArrayList<>();
		// cust_id,name,email,password,amount,regDate,custType
		l.add(validateInputs(101, "arun", "arun@mail.com","pass",1500,"27-08-2019", "gold",l));
		l.add(validateInputs(11, "aashay", "aashay@mail.com","pass",20000,"23-02-2019", "silver",l));
		l.add(validateInputs(5, "aniket","aniket@mail.com","pass",2500,"27-09-2019", "platinum",l));
		l.add(validateInputs(109, "mayank","mayank@mail.com","pass",1000,"27-01-2019","gold",l));
		l.add(validateInputs(1018, "mayank","mayamk@mail.com","pass",500,"27-01-2019","gold",l));
		l.add(validateInputs(103, "barood","barood@mail.com","pass",2000,"27-03-2019","silver",l));

		return l;
	}
	
}
