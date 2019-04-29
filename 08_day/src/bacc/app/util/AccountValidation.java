package bacc.app.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import bacc.app.core.AccType;
import bacc.app.custExc.AccountValidationExc;

public class AccountValidation {
	public static DateTimeFormatter dtf;
	public static LocalDate endYr;
	public static LocalDate prevYr;
	public static double MIN_BAL;
	static {
		dtf = DateTimeFormatter.ofPattern("d-M-yyyy");
		endYr = LocalDate.of(LocalDate.now().getYear(), 4, 30);
		prevYr = LocalDate.of(LocalDate.now().getYear() - 1, 4, 30);
		MIN_BAL = 500;
	}

	public static AccType validateAccType(String acType) throws AccountValidationExc {
		try {
			return AccType.valueOf(acType.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new AccountValidationExc("Not a valid account type");
		}
	}

	public static LocalDate validateDate(String date) throws AccountValidationExc {
		LocalDate ld;
		try {
			ld = LocalDate.parse(date, dtf);
			if (ld.isAfter(endYr) || ld.isBefore(prevYr)) {
				throw new AccountValidationExc("Creation Date must be b/w pev closing to current closing yr");
			}
		} catch (DateTimeParseException e) {
			throw new AccountValidationExc("Not a valid date(dd-mm-yyyy)");
		}
		return ld;
	}

	public static double validateBalance(double bal) throws Exception {
		if (bal < MIN_BAL) {
			throw new AccountValidationExc("Insufficient balance");
		}
		return bal;
	}

}
