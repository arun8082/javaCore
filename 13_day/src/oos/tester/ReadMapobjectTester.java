package oos.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

import io.app.core.Employee;

public class ReadMapobjectTester {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		File file = new File("oosEMTestFile.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			
			Map<Integer,Employee> map = (Map<Integer, Employee>)ois.readObject();
			map.entrySet().stream().forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
