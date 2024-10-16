package com.java.string;

public class Test3 {

	public static void m1() {
		Integer I1 = new Integer(111);
		Integer I2 = new Integer(111);
		System.out.println(I1 == I2);//
		System.out.println(I1.equals(I2));//
	}
	
	
	
	
	public static void m2() {
		StringBuffer sb1 = new StringBuffer("javaselenium");
		StringBuffer sb2 = new StringBuffer("javaselenium");
		
		System.out.println(sb1 == sb2);//false
		System.out.println(sb1.equals(sb2));// false
	}

	public static void main(String[] args) {
		m2();
	}

}
