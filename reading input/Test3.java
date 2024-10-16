package com.java.readinginput;

import java.io.IOException;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) throws IOException {

		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter UserName");
		String userName= scanner.nextLine();
		
		System.out.println("Enter Password");
		String password = scanner.nextLine();
		
		
		if (userName.equals("java") && password.equals("selenium")) 
		
			System.out.println("Login is successfull");
		
		else 
			System.out.println("Login is not successfull");
		
		
	}
	

}
