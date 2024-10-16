package com.java.string;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s1 = new String("javaselenium");
		System.out.println(s1);
		s1.concat("dotnet");
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println();
		System.out.println();
		
		StringBuffer buffer = new StringBuffer("javaselenium");
		buffer.append("dotnet");
		System.out.println(buffer);
		
		
		
	}

}
