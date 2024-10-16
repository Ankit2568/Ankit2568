package com.java.string;

import java.util.Scanner;

public class Test7 {

	public static void m1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		int count = 0;
		for(int i=0; i<value.length();i++)
		{
			char ch = value.charAt(i);
			if ( !((ch>='a' && ch<='z') ||  (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') ||
					(ch==' '))
				) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	
	 
	
	public static void main(String[] args) {
		m1();
	}

}
