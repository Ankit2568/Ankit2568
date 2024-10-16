package com.java.readinginput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your data = ");
		String data =  reader.readLine();
		
		System.out.println("Enter your same data once again = ");
		int value =  reader.read();
		
		System.out.println("Readline = "+data);
		System.out.println("Read = "+value + " [ "+ (char)value+" ] ");
		
		
		
		
		
	}
	

}
