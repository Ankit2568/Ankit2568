  package com.java.static_non_members;

public class Test1 {
	
	
	
	static int i = m1();
	
	static int m1()
	{
		System.out.println("static variable calling");
		return 10;
	}
	
	static {
		System.out.println("static block");
		System.out.println(Test1.i); //0
	
	}
	
	static void m2()
	{
		System.out.println("static m2()");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
	}
	
	

}
