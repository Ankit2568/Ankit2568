package com.java.ifelsecondition;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id = ");
		int employeeId = scanner.nextInt();
		
		System.out.println("Enter Employee name = ");
		String employeeName= scanner.next();

		System.out.println("Enter your Salary = ");
		double employeeSalary = scanner.nextDouble();
		
		if (employeeSalary >= 10000) {
			System.out.println("very Good Employee");
			System.out.println(employeeId+"..."+employeeName+"..."+employeeSalary);
		}
		else
		{
			System.out.println("Good Employee");
			System.out.println(employeeId+"..."+employeeName+"..."+employeeSalary);
		}
		
		scanner.close();
		
	}

}
