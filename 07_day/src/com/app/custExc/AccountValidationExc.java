package com.app.custExc;

@SuppressWarnings("serial")
public class AccountValidationExc extends Exception {
	public AccountValidationExc(String errMsg) {
		super(errMsg);
	}
}
