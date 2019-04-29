package cust.app.util;

import java.util.ArrayList;
import static cust.app.util.ValidationRules.*;
import cust.app.core.Customer;
import cust.app.cusrExc.CustomerHandlingException;

public class TestData {
	public static ArrayList<Customer> populatedData() throws CustomerHandlingException {
		ArrayList<Customer> cl = new ArrayList<Customer>();
		cl.add(new Customer("Abc", validateEmail("zbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("12-10-2018")));
		cl.add(new Customer("ert", validateEmail("gbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("12-10-2018")));
		cl.add(new Customer("LJID", validateEmail("vbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("12-10-2018")));
		cl.add(new Customer("sdoieo", validateEmail("abc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("12-10-2018")));
		cl.add(new Customer("pfgfvncv", validateEmail("bbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("12-10-2018")));
		return cl;
	}

	public static ArrayList<Customer> populatedData2() {
		ArrayList<Customer> cl = new ArrayList<Customer>();
		try {
			cl.add(new Customer(10, "Abc", validateEmail("zbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("28-10-2018")));
			cl.add(new Customer(5, "ert", validateEmail("vbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("3-10-2018")));
			cl.add(new Customer(9, "LJID", validateEmail("dbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("1-10-2018")));
			cl.add(new Customer(1, "sdoieo", validateEmail("abc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("30-10-2018")));
			cl.add(new Customer(11, "pfgfvncv", validateEmail("mbc19.com"), validatePassword("arun@82"), validateBalance(1000), validateRegDate("11-07-2018")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cl;
	}

}
