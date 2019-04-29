package com.tester;

import com.emp.Emp;
import com.emp.Mgr;
import com.emp.Worker;

public class TestData {
	public static Emp[] data(){
		Emp e[]=new Emp[4];
		e[0]=new Mgr("m1","m1@mail.com","10",200,100);
		e[1]=new Worker("w1", "w1@mail.com", "30", 500, 8, 100);
		e[2]=new Mgr("m2","m2@mail.com","20",400,200);
		e[3]=new Worker("w3", "w3@mail.com", "60", 900, 2, 500);
		return e;
	}
}