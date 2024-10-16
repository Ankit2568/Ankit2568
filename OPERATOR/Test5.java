package com.java.basic;

// Equality Operator
 
public class Test5 {
	
	public static void main(String[] args) {
	
		System.out.println(10==10);// true
		System.out.println(10==5);// false
		
		System.out.println();
		
		System.out.println(10 != 10); // false
		System.out.println(10 != 5); // true
		
		System.out.println();
		
		System.out.println(true == true); // true
		System.out.println(true == false); // false
		
		System.out.println();
		
		System.out.println(true != true); // false
		System.out.println(true != false); // true
		
		System.out.println();
		
		System.out.println('a' == 'b'); // false
		System.out.println('a' != 'b'); // true
		
		System.out.println();
		
		System.out.println(10 == 10.0); // true
		System.out.println(97 == 'a'); //  true
		
		System.out.println();
		
		System.out.println(10 == 10.0); // true
		System.out.println(97 == 'a'); //  true

		System.out.println();
	
		
		
		System.out.println("a" == "a"); // true
		System.out.println(0 == 0);  //true
		System.out.println(0 == 0.0);  // true
		System.out.println(-0.0 == 0.0); // true
		System.out.println(-10 == 10); // false
		
	}
}
