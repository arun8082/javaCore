package com.emp;

public class Mgr extends Emp {
	private double perfBonus;

	public Mgr(String name, String email, String deptId, double basic,double perfBonus) {
		super(name, email, deptId, basic);
		this.perfBonus = perfBonus;
	}

	@Override
	public double netSalary() {
		return super.getBasic() + perfBonus;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ " " + perfBonus 
				+ " "+ netSalary();
	}

	public double getPerformanceBonus() {
		return perfBonus;
	}
}
