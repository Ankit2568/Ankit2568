package com.java.static_non_static__members;

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
		
		// 4 - ways to call the static method
		
		m2(); // way-1
		
		Test1.m2(); // way-2
		
		Test1 test1 = new Test1(); // way-3
		test1.m2();
		
		Test1 t1 = null; //way - 4   Null Reference variable
		t1.m2();
		
		
		
		
		
	}
	
	

}
