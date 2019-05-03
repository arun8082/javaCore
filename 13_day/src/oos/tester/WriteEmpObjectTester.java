package oos.tester;

import static io.app.util.TestData.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import io.app.core.Employee;

public class WriteEmpObjectTester {

	public static void main(String[] args) {
		File file =new File("oosEOTestFile.ser");
		try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file))) {
			
			Employee[] e = populateArray();
			Employee e1=new Employee(10, "Arun", "Developer", 1045.50, LocalDate.parse("2019-01-03"), 9.76);
			oos.writeObject(e);
			oos.writeObject(e1);
			oos.writeObject(e1);
			System.out.println("File write completed EO");
						
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

	}

}
