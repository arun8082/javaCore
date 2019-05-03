package dser.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import io.app.core.Employee2;

public class SerialReadTester2 {

	public static void main(String[] args) {
		File file = new File("SWTestFile2.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
			Employee2 e=(Employee2) ois.readObject();
			System.out.println(e);
			System.out.println("Read file complateed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
