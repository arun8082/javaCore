package com.utils;

import com.exc.MyException;

public class Validate {
	public static void m2(int t) throws Exception{
		if(t<0)
			throw new MyException("less than 0");
		else
			throw new MyException("greater than 0"); 
	}
}
