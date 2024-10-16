package com.java.forloop;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter N value = ");
		 int number = scanner.nextInt(); //10 -> 10 9 8 7 6 5 4 3 2 1 0
		 
		 for(int i=number; i>=0; i--)
		 {
			 System.out.print(i+" ");
		 }
		 
		 
		
	}
	 
}
 
