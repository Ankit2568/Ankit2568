package com.java.ifelsecondition;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st Number:- ");
		int a = scanner.nextInt();
	
		System.out.println("Enter 2nd Number:- ");
		int b = scanner.nextInt();

		System.out.println("Enter 3rd Number:- ");
		int c = scanner.nextInt();

		if (a>b && a>c) {
			System.out.println("Max = "+a);
		}
		else if(b>c)
		{
			System.out.println("Max = "+b);
		}
		else
		{
			System.out.println("Max = "+c);
		}
	}
}
