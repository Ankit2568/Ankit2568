package com.java.arrays;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		 
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter Array Size = "); 
		int number =  scanner.nextInt(); //5
		int a[] = new int[number];
		System.out.println("Enter "+number+" Elements");
		
		for(int i=0; i<number; i++)
		{
			a[i] = scanner.nextInt();
		}
		
		for(int item : a)
		{
			System.out.println(item);
		}
	 
		
		 
		
		
		
		
	}

}
