package emp.app.util;

import java.util.HashMap;

import emp.app.core.Employee;

public class TestData {
	public static HashMap<Integer, Employee> populateData() {
		HashMap<Integer, Employee> hm = new HashMap<>();
		hm.put(10, new Employee(10, "rnd", "abc1", 12000));
		hm.put(101, new Employee(101, "prod", "abc2", 15000));
		hm.put(45, new Employee(45, "rnd", "abc3", 11000));
		hm.put(3, new Employee(3, "rnd", "abc4", 22000));
		return hm;
	}
}
