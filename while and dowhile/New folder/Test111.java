package com.java.forEachLoop;

public class Test1 {

	public static void main(String[] args) {
		
		int a[] = {111,222,333,444,555};
		
		for(int i = 0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println();
		
		for(int item : a)
		{
			System.out.println(item);
		}
		
 
		
	}
}