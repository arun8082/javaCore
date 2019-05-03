package oos.tester;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import io.app.core.Employee;
import static io.app.util.TestData.*;

public class WriteMapObjecttester {

	public static void main(String[] args) {
		File file = new File("oosEMTestFile.ser");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			Map<Integer, Employee> map = populateMap();
			oos.writeObject(map);
			oos.writeObject(map);
			System.out.println("File write completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
