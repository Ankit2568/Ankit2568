package com.java.switchstatement;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter any number = ");
		int n = scanner.nextInt();
		
		String str = "aaa";
		
		switch(n)
		{
		
		case 0:{
			System.out.println("Zero"); 
		}
		default: System.out.println("Invalid");
		case 1: {
			System.out.println("One"); 
		}
		case 2: {
			System.out.println("two"); 
		}
		case 3: System.out.println("three"); 
		case 4: System.out.println("four"); 
		case 5: System.out.println("five"); 
		case 6: System.out.println("six"); 
		case 7: System.out.println("seven"); 
		
		
		
		
		}
		 
	}

}
