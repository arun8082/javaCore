package dis.tester;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import io.app.core.Employee;

import static io.app.util.TestData.*;

public class WriteReadMapData {

	public static void main(String[] args) {
		// write map data
		try {
			File file = new File("mapTestFile.ser");
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			Map<Integer, Employee> map = populateMap();
			map.entrySet().stream().forEach(System.out::println);;
			
			for(Map.Entry<Integer, Employee> e:map.entrySet()) {
				System.out.println(e.getValue());
			}
			
			//Can't able to write map data in file using DataOutputStream
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// read map data
		try {

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
