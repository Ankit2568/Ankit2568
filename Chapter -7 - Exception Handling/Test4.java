package com.java.exceptionHandling;

public class Test4 {

	public static void m1() throws Exception
	{
		System.out.println("m1() method");
	}
	
	public static void m2() throws Exception
	{
		/*
		 * try { m1(); } catch(Exception exception) {
		 * 
		 * }
		 */
		
		m1();
	}
	
	public static void main(String[] args) throws Exception {
		 
	m2();

	}

}
