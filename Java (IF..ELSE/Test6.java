package com.java.ifelsecondition;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A value = ");
		int a = scanner.nextInt();
		
		System.out.println("Enter B value = ");
		int b = scanner.nextInt();
		
		if(a>b)
		{
			System.out.println(a+ " is big than "+ b);
		}
		else {
			System.out.println(b+ " is big than "+ a);
		}
		 
		scanner.close();
		
	}

}
