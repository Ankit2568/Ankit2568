package com.java.nestedloop;

public class Test4 {

	public static void main(String[] args) {

		int outerLoopIndex, innerLoopIndex, keySpace, applySpace=10;
		
		 for(outerLoopIndex=1; outerLoopIndex<=5; ++outerLoopIndex)
		 {
			
			 System.out.println();
			 System.out.println("Outer Loop Iteration Level : "+outerLoopIndex);
			 System.out.println();
			 
			 for(innerLoopIndex=1; innerLoopIndex <= outerLoopIndex; ++innerLoopIndex)
			 {
				 System.out.println("Outer Loop Index value is : "+outerLoopIndex 
						 +" \t Inner Loop Index value is : "+innerLoopIndex);
			 }
		 }
		 applySpace--;
		 
		
		
	}
}