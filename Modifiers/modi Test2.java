package com.java.modifiers1;

public class Test2 extends Employee{
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		/*
		 * int empId = employee.getEmpId(); String empName = employee.getEmpName();
		 * float empSalary = employee.getEmpSalary();
		 * 
		 * System.out.println(empId); System.out.println(empName);
		 * System.out.println(empSalary);
		 */
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		
		
	}
	 
}
