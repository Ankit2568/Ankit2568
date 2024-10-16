package com.java.string;

public class Test2 {

	public static void m1()
	{
		String s1 = new String("javaselenium");
		String s2 = new String("javaselenium");
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
	}
	
	public static void m2()
	{
		String s1 = new String("javaselenium");
		System.out.println(s1); //javaselenium
		s1.concat("Dot Net");
		System.out.println(s1); //javaselenium
		
		s1 = s1.concat("Python");
		System.out.println(s1); // javaseleniumpython
	}
	
	
	public static void m3()
	{
		String s1 = new String("javaselenium");
		String s2 = s1.toString();
		String s3 = s1.toUpperCase();
		String s4 = s1.toLowerCase();
		String s5 = s1.toUpperCase();
		String s6 = s3.toLowerCase();
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s5);
		System.out.println(s1 == s6);
		
	}
	
	
	public static void main(String[] args) {
		
		m3();
		
	}
}
















