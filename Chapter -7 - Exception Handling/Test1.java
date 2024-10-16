package com.java.exceptionHandling;

// Exception - Exception is an Object, these object will be created when any intrruption
//			   occur in program at runtime.
// In order to handle this exception we need to some mechanism. That Mechanism is a keyword
//  try / catch / finally => with these keyword we can achieve ExceptionHandling.

// In Exception Hierarchy - only 2 classes are partially checked Exception
//							-> Throwable
//							-> Exception

// Q) Which Exception class is called as partially checked Exception and Fully checked Exception
//Partially Checked Exception - Throwable and Exception, it is because these 2 classes
//contains CheckedException and UncheckedException.

//Fully Checked Exception - Direct Subclasses of Exception class and its subclasses
//called as Fully CheckedException... (or)
//Direct sub classes of CheckedException is called Fully CheckedException

// UncheckedException -> Direct Subclasses of RuntimeException(C) and Direct Subclasses of 
//						 Error class is called UncheckedException
// The exception which are not checked by compilers called as UncheckedException

// CheckedException ->   Direct Subclasses of Exception class called as CheckedException
//The exception which are checked by compilers called as CheckedException.

//


public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("Hello - 1");
		System.out.println("Hello - 2");
		System.out.println("Hello - 3");
		System.out.println("Hello - 4");
		
		System.out.println(10/0);
		
		System.out.println("Hello - 5");
		System.out.println("Hello - 6");
		System.out.println("Hello - 7");
		System.out.println("Hello - 8");
		System.out.println("Hello - 9");

	}
	
}
