package com.java.forloop;

public class Test1 {

	public static void main(String[] args) {
 
		for(int i=1, x=111 ; i<=5 ; i++ )
		{
			System.out.println("java i = "+i+" and Selenium = "+x);
		}
		
		System.out.println();
		

		for(int i=1, x=111 ; i<=5 ; i++, x+=111 )
		{
			System.out.println("java = "+i+" and Selenium = "+x);
		}
		
		
		
	}
}