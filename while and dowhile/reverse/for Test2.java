package com.java.forloop;

public class Test2 {
	
	public static void main(String[] args) {
		
		for(int i=1, x=111; i<=5 || x<=999; i++, x+=111)
		{
			System.out.println("Java = "+i+" Selenium = "+x);
		}
		
		System.out.println();
		
		for(int i=1, x=111; i<=5 || x<=999;)
		{
			System.out.println("Java = "+i+" Selenium = "+x);
		}
		
	}
	 
}
 
