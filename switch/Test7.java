package com.java.ifelsecondition;

import java.util.Scanner;

public class Test7 {
	
	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Employee name = ");
		 String employeeName = scanner.nextLine();
		 
		 System.out.println("Enter the Employee Salary = ");
		 double employeeSalary = scanner.nextDouble();
		 
		 System.out.println("Enter the Employee gender = ");
		 char employeeGender = scanner.next().charAt(0);
		 
		 System.out.println("Employee Details are Before Updation :-");
		 System.out.println(employeeName+"..."+employeeSalary+"..."+employeeGender);
		 		 
		 if (employeeGender=='f' || employeeGender=='F') {
			 //employeeSalary = employeeSalary + employeeSalary * 0.06;
			 employeeSalary = employeeSalary * 1.06;
		}
		 
		 System.out.println("Employee Details After Salary Updation :-");
		 System.out.println(employeeName+"..."+employeeSalary+"..."+employeeGender);
	}

}
