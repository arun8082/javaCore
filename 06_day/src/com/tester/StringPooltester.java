package com.tester;

public class StringPooltester {
	public static void main(String[] args) {
		String s1="abcde";
		String s2="hgfds";
		String s3="abcde";
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
		System.out.println("s3: "+s3.hashCode());
		String s4="pooko";
		String s5="09iej";
		String s6="abcde";
		System.out.println("s6: "+s6.hashCode());
		System.out.println("m1: "+m1());
	}
	static int m1() {
		String s7="abcde";
		return s7.hashCode();
	}
	
}
