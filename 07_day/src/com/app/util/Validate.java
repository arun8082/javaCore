package com.app.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

import com.app.core.AccType;
import com.app.custExc.AccountValidationExc;

public class Validate {
	public static int MIN_BAL;
	public static DateTimeFormatter dtf;
	public static LocalDate endYr;
	static {
		dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
		endYr = LocalDate.of(LocalDate.now().getYear(), 12, 31);
		MIN_BAL = 1000;
	}

	public static double validateBalance(double bal) throws Exception {
		if (bal < MIN_BAL) {
			throw new AccountValidationExc("Insufficient balance");
		}
		return bal;
	}

	public static AccType validateAccountType(String acType) throws Exception {
		try {
			return AccType.valueOf(acType.toUpperCase());
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Valid account types are: " + Arrays.toString(AccType.values()));
			throw new AccountValidationExc("Not a valid account type\n" + sb);
		}
	}

	public static LocalDate validateCreationDate(String date) throws Exception {
		LocalDate ld = null;
		try {
			ld = LocalDate.parse(date, dtf);
		} catch (DateTimeParseException e) {
			throw new AccountValidationExc("Date is invalid format(dd/mm/yyyy)");
		}
		if (ld.isAfter(endYr)) {
			throw new AccountValidationExc("Date must be before end year");
		}
		return ld;
	}
}
