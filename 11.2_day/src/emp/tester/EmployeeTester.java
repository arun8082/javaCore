package emp.tester;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import static emp.app.util.TestData.*;
import emp.app.core.Employee;
import emp.app.custExc.EmpException;

public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			HashMap<Integer, Employee> hm = populateData();// new HashMap<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options 1: Hire Emp 2:Display all emp's dtls 3:Fire Emp 4:Update sal 5: Sort by id 10 Exit");
					System.out.print("Enter option: ");
					switch (sc.nextInt()) {
					case 1:// hire emp
						System.out.println("Enter emp dtls id dept nm sal");
						int id = sc.nextInt();
						System.out.println(hm.put(id, new Employee(id, sc.next(), sc.next(), sc.nextDouble())));
						break;
					case 2:// display all
						System.out.println("Employee details: ");
						for (Employee e : hm.values())
							System.out.println(e);
						break;
					case 3:// fire emp
						System.out.println("Enter employee ID: ");
						Employee e = hm.remove(sc.nextInt());
						if (e == null) {
							throw new EmpException("Invalid emp");
						}
						System.out.println(e);
						break;
					case 4:// update salary
						System.out.println("Enter employee ID: ");
						e = hm.get(sc.nextInt());
						if (e == null) {
							throw new EmpException("Invalid emp");
						}
						System.out.print("Enter salary: ");
						e.setSalary(e.getSalary() + sc.nextDouble());
						System.out.println("Salary updated");
						break;
					case 5:// sort by id
						TreeMap<Integer, Employee> tm = new TreeMap<>(hm);
						System.out.println("Sorted details: ");
						for (Employee e1 : tm.values())
							System.out.println(e1);
						break;
					case 6:// sort by id
						//Create empty TreeSet
						TreeSet<Employee> ts = new TreeSet<Employee>(new Comparator<Employee>() {

							@Override
							public int compare(Employee o1, Employee o2) {

								return o1.getName().compareTo(o2.getName());
							}

						});
						//or lambda Expr
						
						//Add objects into TreeSet from HashMap
						for (Employee e2 : hm.values())
							ts.add(e2);

						System.out.println("Sorted details: ");
						for (Employee e1 : ts)
							System.out.println(e1);
						break;
					case 10:// exit
						exit = true;
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
