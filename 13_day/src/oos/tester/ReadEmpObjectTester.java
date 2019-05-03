package oos.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

import io.app.core.Employee;

public class ReadEmpObjectTester {

	public static void main(String[] args) {
		File file = new File("oosEOTestFile.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			Employee e[] = (Employee[]) ois.readObject();
			Arrays.stream(e).forEach(v -> System.out.println(v));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
