package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
	
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
		
		 System.out.println(Arrays.toString(a));
		 
		 int max = a[0];
		 
		 for(int i=1; i<number ;i++)
		 {
			 if (max<a[i]) {
				max = a[i];
			}
		 }
		 
		 System.out.println(max);
	 
	}
}