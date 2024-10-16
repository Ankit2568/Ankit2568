package com.java.modifiers1;

public class ProtectedDemo {

	protected int empId = 1001;
	protected String empName = "anand";
	protected float empSalary = 20000;
	
	protected ProtectedDemo() {
	}
	
	
	public static void main(String[] args) {
		
		ProtectedDemo demo = new ProtectedDemo();
		System.out.println(demo.empId);
		System.out.println(demo.empName);
		System.out.println(demo.empSalary);
		
		
	}
	
	
}
