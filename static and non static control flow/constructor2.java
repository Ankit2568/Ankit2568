package com.java.static_non_static__members;

	/* Non-static Members
	 * -----------------
		 * Non-static variable
		 * Non-static Block
		 * Non-static Method
		 * Constructor
		 * 
	 */

public class Test2 {
	
	// non-static variable
		int i = m1();
	
	int m1()
	{
		System.out.println("1st static variable calling");
		return 10;
	}
	
	
	//non-static block
	{
		System.out.println("1st Non-static Block");
	}
	
	//non-static method
	void m2()
	{
		System.out.println("In m2() method");
		
	}
	
	//  constructor
	public Test2() {
		System.out.println("This is constructor");
	}
	

	//non-static block
	{
		System.out.println("2nd Non-static Block");
	}
		
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.m2();
	}
	
	

	//non-static block
	{
		System.out.println("3rd Non-static Block");
	}
	
	// non-static variable
		int m5 = m5();
		
		int m5()
		{
			System.out.println("m5 variable calling");
			return 10;
		}

}
