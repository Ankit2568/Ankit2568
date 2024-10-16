package com.java.nestedloop;

public class Test1 {

	public static void main(String[] args) {
		
		 for(int i=1; i<=5; i++) // 5 times
		 {
			 for(int j=1; j<=5;j++) // 5 times
			 {
				 System.out.println("i ="+i+ "  j ="+j); // 25 times			 
			 }
		 }
	}
}