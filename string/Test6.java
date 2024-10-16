package com.java.string;

import java.util.Scanner;

public class Test6 {

	public static void m1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		int count = 0;
		for(int i=0; i<value.length();i++)
		{
			if (value.charAt(i) >='0' && value.charAt(i)<='9') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	 
	
	public static void main(String[] args) {
		m1();
	}

}
