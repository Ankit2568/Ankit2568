package com.java.ifelsecondition;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		//int age = 20;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age = ");
		int age = scanner.nextInt();
		
		if(age>22)
		{
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("wait for some more few years");
		}
		
	}

}
