package com.java.basic;

 // compound Operator
public class Test4 {
	
	public static void main(String[] args) {
	
		/*
		int a = 10;
		int b = a+10;
		int c = a+=10;
		
		System.out.println(a); //20
		System.out.println(b); //20
		System.out.println(c); //20
		*/
		
		int a = 10;
		a += 10;
		a = a + 10;
		a = 10 + 10;
		System.out.println(a); //10 20
		
		a += 'a';
		a = a + 'a';
		a = 10 + 'a';
		a = 10 + 97;
		a = 107;
		System.out.println(a);
		
		
		// We cannot assign String on int variable
		
		//a += "a";
		//a = a + "a";
		//a = "10" +"a";
		//a = "10a";
		
		// On String we can only apply += operator
		// += operator can be overloaded
		
		String s = "a";
		s += "b";
		s = s + "b";
		System.out.println(s); // abb
		
		s += 10;
		System.out.println(s); // abb10
		
		s += 10-20;
		s = s + (10-20);
		System.out.println(s); //abb10-10-10
		
		
		
		
		
		
		
	}
}
