package test.tester;

import java.util.HashMap;

public class HashMapTester {
	int a;

	public HashMapTester(int a) {
		super();
		this.a = a;
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("hascode");
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof HashMapTester))
			return false;
		HashMapTester other = (HashMapTester) obj;
		if (a != other.a)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "HashMap a=" + a ;
	}

	public static void main(String[] args) {
		HashMap<Integer, HashMapTester> hm=new HashMap<>(); 
		System.out.println(hm.put(1, new HashMapTester(10)));
		System.out.println(hm.put(null,null));
		System.out.println(hm.put(null,null));
		System.out.println(hm.put(2,null));
		System.out.println(hm.put(2,null));
		System.out.println(hm.put(3,null));
		
		//System.out.println(hm.put(1, new HashMapTester(10)));
		//System.out.println(hm.put(1, new HashMapTester(10)));
		//System.out.println(hm.put(1, new HashMapTester(10)));
		//System.out.println(hm.put(1, new HashMapTester(10)));
		//System.out.println(hm.put(1, new HashMapTester(10)));
		
		System.out.println(hm);
	}
}

