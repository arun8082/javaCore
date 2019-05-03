package dser.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import io.app.core.Employee2;
import io.app.core.Employee3;
import io.app.core.Employee4;

public class SerialReadTester4 {

	public static void main(String[] args) {
		File file = new File("SWTestFile4.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
			Employee4 e=(Employee4) ois.readObject();
			System.out.println(e);
			System.out.println("Read file complateed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
