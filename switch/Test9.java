package com.java.ifelsecondition;

import java.util.Scanner;

public class Test9 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 6 subject marks ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		int s4 = scanner.nextInt();
		int s5 = scanner.nextInt();
		int s6 = scanner.nextInt();
		
		int total =  s1+s2+s3+s4+s5+s6;
		double percentage = total/600.0 *100;
		
		
		if (percentage>70) {
			System.out.println("Grade A");
		}
		else if(percentage>=60)
		{
			System.out.println("First class");			
		}
	
		else if(percentage>=50)
		{
			System.out.println("Grade B");			
		}

		else if(percentage>=40)
		{
			System.out.println("Grade C");			
		}
		else {
			System.out.println("Fail");
		}
	}
}
