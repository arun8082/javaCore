package test.tester;

import java.util.LinkedHashSet;

public class LinkedHashSetTester {
	private int a;
	
	
	public LinkedHashSetTester(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "LinkedHashSet a=" + a;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof LinkedHashSetTester))
			return false;
		LinkedHashSetTester other = (LinkedHashSetTester) obj;
		if (a != other.a)
			return false;
		return true;
	}

	

	public static void main(String[] args) {
		LinkedHashSet<LinkedHashSetTester> lhs= new LinkedHashSet<LinkedHashSetTester>();
		System.out.println(lhs.add(new LinkedHashSetTester(12)));
		System.out.println(lhs.add(new LinkedHashSetTester(13)));
		System.out.println(lhs.add(new LinkedHashSetTester(12)));
		System.out.println(lhs.add(new LinkedHashSetTester(12)));
		System.out.println(lhs.add(new LinkedHashSetTester(12)));
		System.out.println(lhs.add(new LinkedHashSetTester(12)));
		System.out.println(lhs.add(null));
		System.out.println(lhs.add(null));
		
		System.err.println(lhs);

	}

}
