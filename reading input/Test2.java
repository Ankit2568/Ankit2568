package com.java.readinginput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your 1st value = ");
		String value1 =  reader.readLine();
		
		System.out.println("Enter your 2nd value = ");
		String value2 =  reader.readLine();
		
		Integer firstValue = Integer.parseInt(value1);
		Integer secondValue = Integer.parseInt(value2);
		
		System.out.println("Addition of 2 values = "+(firstValue+secondValue));
		System.out.println("Substraction of 2 values = "+(secondValue-firstValue));
		System.out.println("Division of 2 values = "+(firstValue/secondValue));
		System.out.println("Multiplication of 2 values = "+(firstValue*secondValue));
		
		
		
		
		
		
	}
	

}
