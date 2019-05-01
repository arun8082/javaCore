package io.tester;

import static io.app.util.TestData.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.app.core.Employee;

public class WriteListData {

	public static void main(String[] args) {
		List<Employee> list = populateList();
		try {
			File file = new File("testFile.data");
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

			list.sort((e1, e2) -> ((Integer) e1.getId()).compareTo(e2.getId()));
			list.forEach(e -> {
				try {
					dos.writeInt(e.getId());
					dos.writeUTF(e.getName());
					dos.writeUTF(e.getDept());
					dos.writeDouble(e.getSalary());
					dos.writeUTF(e.getHireDate().toString());
					dos.writeDouble(e.getPerformanceIndex());

				} catch (IOException e3) {
					e3.printStackTrace();
				}
			});
			System.out.println("write complted\n\n");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			File file = new File("testFile.data");
			DataInputStream dio = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

			ArrayList<Employee> list1 = new ArrayList<Employee>();
			try {
				System.out.println("read file start");
				while (true) {
					System.out.println(list1.add(new Employee(
							dio.readInt(),
							dio.readUTF(),
							dio.readUTF(),
							dio.readDouble(),
							LocalDate.parse(dio.readUTF()),
							dio.readDouble()
							)
							));
				}				
			} catch (EOFException e) {
				System.out.println("internal try");
				e.printStackTrace();
				System.out.println(list1);
				list1.forEach(i->System.out.println(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
