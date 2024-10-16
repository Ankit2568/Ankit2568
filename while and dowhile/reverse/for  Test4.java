package com.java.forloop;

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter N value = ");
		 int number = scanner.nextInt();  
		 
		 for(int i=1, x=1 ; i<=number; i++, x+=3)
		 {
			 System.out.print(x+" , ");
		 }
		 
		 
		
	}
	 
}
 
