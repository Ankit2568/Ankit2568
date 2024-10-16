package com.java.branchingstatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * System.out.println("break statements output"); for(int i = 0 ; i<5; i++) {
		 * System.out.println(i+" Hi");
		 * 
		 * for(int j=0; j<5; j++) { if (j == 3) { break; } System.out.println("   " + j
		 * + " Hello"); }
		 * 
		 * }
		 */
		 
		System.out.println("continue Statement output");
		 for(int i = 0 ; i<5; i++)
		 {
			 System.out.println(i+" Hi");
			 
			 for(int j=0; j<5; j++)
			 {
				 if (j == 3) {
					continue;
				}
				 System.out.println("   " + j + " Hello");
			 }
			 
		 }
		
		
		
	}
}