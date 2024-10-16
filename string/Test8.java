package com.java.string;

import java.util.Scanner;

public class Test8 {

	public static void m1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		
		StringBuffer buffer = new StringBuffer(value);
		
		buffer.reverse();
		System.out.println(buffer);
		
	}
	
	public static void main(String[] args) {
		m1();
	}

}
