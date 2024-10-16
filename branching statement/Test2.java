package com.java.branchingstatements;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		for(int i=100; i<=500; i++)
		{
			if (i%10 == 4) {
				continue;
			}
			else
				System.out.println(i+" ");
		}
		
	}

}

