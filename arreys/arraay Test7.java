package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
	
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
	 
		 int sum = 0;
		 
		 for(int item : a)
		 {
		 sum = (sum + item) ;
		 }
		 System.out.println(sum);
		 
	}

}
