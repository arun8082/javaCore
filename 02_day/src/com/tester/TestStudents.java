package com.tester;
import com.cdac.core.*;

class TestStudents 
{
	public static void main(String[] args) 
	{
		Student st1 = new Student("a","a@mail.com",21);
		Student st2 = new Student("b","b@mail.com",22);
		Student st3 = new Student("c","c@mail.com",22);
		st1.computeGPA(10,20,30);
		st2.computeGPA(40,50,60);
		st3.computeGPA(70,80,90);
		st1.getStudentDetails();
		st2.getStudentDetails();
		st3.getStudentDetails();
		if(st1.getGPA() < st2.getGPA()){
			System.out.println(st2.getStudentDetails());
		}else{
			System.out.println(st1.getStudentDetails());
		}
	}
}
