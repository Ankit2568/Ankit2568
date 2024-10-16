package com.java.switchstatement;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		int b = 125; // -128 to 127
		
		String str = "aaa";
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter any number = ");
		int n = scanner.nextInt();
		
		switch(b) {
			 
		case 120: System.out.println("three"); 
		case 121: System.out.println("four"); 
		case 127: System.out.println("five"); 
		case 125: System.out.println("six"); 
		case 129: System.out.println("seven"); 
		
		}
		
		 
	}

}
