package com.java.nestedloop;

public class Test2 {

	
	public static void main(String[] args) {

		int outerLoopIndex, innerLoopIndex;
		
		 for(outerLoopIndex=0; outerLoopIndex<=5; outerLoopIndex++)
		 {
			 for(innerLoopIndex=0; innerLoopIndex<outerLoopIndex; innerLoopIndex++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 
		
		
	}
}