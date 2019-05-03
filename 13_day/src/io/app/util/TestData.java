package io.app.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.app.core.*;

import static java.time.LocalDate.*;

public class TestData {
	public static Map<Integer, Employee> populateMap() {
		HashMap<Integer, Employee> hm = new HashMap<>();
		hm.put(10, new Employee(10, "abc1", "rnd", 12000, now(), 5.5));
		hm.put(101, new Employee(101, "abc2", "prod", 15000, parse("2019-01-01"), 8));
		hm.put(45, new Employee(45, "abc3", "rnd", 11000, of(2017, 5, 25), 7.8));
		hm.put(3, new Employee(3, "abc4", "rnd", 22000, parse("2018-09-21"), 7.6));
		return hm;
	}

	public static List<Employee> populateList() {
		LinkedList<Employee> l1 = new LinkedList<>();
		l1.add(new Employee(10, "abc1", "rnd", 12000, now(), 5.5));
		l1.add(new Employee(101, "abc2", "prod", 15000, parse("2019-01-01"), 8));
		l1.add(new Employee(45, "abc3", "rnd", 11000, of(2017, 5, 25), 7.8));
		l1.add(new Employee(3, "abc4", "rnd", 22000, parse("2018-09-21"), 7.6));
		return l1;
	}

	public static Employee[] populateArray() {
		return new Employee[] { new Employee(10, "abc1", "rnd", 12000, now(), 5.5),
				new Employee(101, "abc2", "prod", 15000, parse("2019-01-01"), 8),
				new Employee(45, "abc3", "rnd", 11000, of(2017, 5, 25), 7.8),
				new Employee(3, "abc4", "rnd", 22000, parse("2018-09-21"), 7.6) };
	}
}
