package dser.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import io.app.core.Employee1;
import io.app.core.Employee2;

public class SerialReadTester1 {

	public static void main(String[] args) {
		File file = new File("SWTestFile1.ser");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));) {
			Employee1 e=(Employee1) ois.readObject();
			System.out.println(e);
			//System.out.println(e);
			System.out.println("Read file complateed");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
