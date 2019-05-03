package ser.tester;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import io.app.core.Employee3;
import io.app.core.Employee4;

public class SerialWriteAllSerializeTransTester4 {

	public static void main(String[] args) {
		File file = new File("SWTestFile4.ser");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			Employee4 e = new Employee4(101, "abc", "rnd", 90000, LocalDate.parse("2019-05-17"), 7.9);
			e.setAddress("Pasan", "Pune", "india");
			oos.writeObject(e);
			System.out.println("Data write completed");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
