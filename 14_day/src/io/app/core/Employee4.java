package io.app.core;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Employee4 implements Serializable {
	private int id;// unique ID
	private String name, dept;
	private double salary;
	private LocalDate hireDate;
	private double performanceIndex;
	private transient Address4 add;

	public Employee4(int id, String name, String dept, double salary, LocalDate hireDate, double performanceIndex) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.hireDate = hireDate;
		this.performanceIndex = performanceIndex;
	}

	public void setAddress(String city, String state, String country) {
		this.add = new Address4(city, state, country);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", hireDate=" + hireDate + ", performanceIndex=" + performanceIndex + ", add=" + add + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getPerformanceIndex() {
		return performanceIndex;
	}

	public void setPerformanceIndex(double performanceIndex) {
		this.performanceIndex = performanceIndex;
	}

}
