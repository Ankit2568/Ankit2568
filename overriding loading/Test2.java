package com.java.overloadingoverriding;

public class Test2 {

	public void m1()
	{
		System.out.println("m1() method in Test2");
	}
	
	/*
	 * public void m1(int i) { System.out.println("m1() int - method in Test2"); }
	 */
	
	public void m1(double i)
	{
		System.out.println("m1() double - method in Test2");
	}
	
	
	public void m2(int i, double d1)
	{
		System.out.println("int - double method");
	}
	
	public void m2(double d1 , int i )
	{
		System.out.println("double - int method");
	}
	
	
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2.m1();
		test2.m1(10); // Automatic type casting is allowed in Method overloading
		
		//test2.m2(10,10);
		
	}
	
	
	
}
