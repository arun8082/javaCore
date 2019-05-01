package hm.tester;

import java.util.Map;

import static hm.lambda.util.TestData.*;
import hm.lambda.core.Employee;

public class HashMapForeachTester {

	public static void main(String[] args) {
		Map<Integer,Employee> map=populateMap();
		//retrieve map data using forEach
		map.forEach((k,v)->System.out.println(v));
		System.out.println();
		
	}

}
