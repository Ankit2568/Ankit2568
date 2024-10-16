package com.java.string;

import java.util.Scanner;

public class Test5 {

	public static void m1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		
		for(int i=0; i<value.length();i++)
		{
			if (i%2 !=0)
			System.out.println("index: "+i + " and Character :"+ value.charAt(i));
		}
		
	}
	
	
	public static void m2()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		int vowelCount= 0 , consonantsCount = 0;
		
		for(int i=0; i<value.length();i++)
		{
			char ch = value.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
				vowelCount++;
			}
			else
				consonantsCount++;
		}
		System.out.println("count of Vowels = "+vowelCount);
		System.out.println("count of Consonants = "+consonantsCount);
	}

	
	
	
	public static void m3()
	{
		// number of upper case alphabet
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine();
		
		int count=0;
		
		for(int i=0; i<value.length();i++)
		{
			if (value.charAt(i) >='A' && value.charAt(i)<='Z') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		m3();
	}

}
