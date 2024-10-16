package com.java.nestedloop;

public class Test3 {

	public static void main(String[] args) {

		int outerLoopIndex, innerLoopIndex, keySpace, applySpace=10;
		
		 for(outerLoopIndex=0; outerLoopIndex<10; outerLoopIndex++)
		 {
			 
			 for(keySpace=0; keySpace < applySpace; keySpace++)
			 {
				 System.out.print(" ");
			 }
			 
			 for(innerLoopIndex=0; innerLoopIndex < outerLoopIndex; innerLoopIndex++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 applySpace--;
		 
		
		
	}
}