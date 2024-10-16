package com.java.readinginput;

import java.io.IOException;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your 1st value = ");
		int firstValue = scanner.nextInt();
		
		System.out.println("Enter your 2nd value = ");
		int secondValue = scanner.nextInt();
		 
		System.out.println("Addition of 2 values = "+(firstValue+secondValue));
		System.out.println("Substraction of 2 values = "+(secondValue-firstValue));
		System.out.println("Division of 2 values = "+(firstValue/secondValue));
		System.out.println("Multiplication of 2 values = "+(firstValue*secondValue));
		
		
		
		
		
		
	}
	

}
