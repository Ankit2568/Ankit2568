package com.java.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test9 {

	public static void m1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string = ");
		String value = scanner.nextLine(); // java selenium java
		StringBuffer buffer2 = null;;
		
		StringBuffer buffer1 = new StringBuffer();
		 
		StringTokenizer tokenizer = new StringTokenizer(value);
		int i=0;
		while(tokenizer.hasMoreTokens())
		{
			String tokenValue =  tokenizer.nextToken();
			buffer2 =  new StringBuffer(tokenValue);
			if(i%2 != 0)
				buffer2.reverse();
			buffer1.append(buffer2);
			buffer1.append(" ");
			i++;
		}
		System.out.println(buffer1);
	}
	
	public static void main(String[] args) {
		m1();
	}

}
