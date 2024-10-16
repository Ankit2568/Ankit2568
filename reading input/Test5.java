package com.java.readinginput;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) throws IOException {

		 Console console = System.console();
		 String userName = console.readLine("Enter UserName = ");
		 
		 char []password = console.readPassword("Enter password");
		 String userPassword = new String(password);
		 
		 if (userName.equals("java") && userPassword.equals("selenium")) 
			 System.out.println("Login is successfull");
				
		 else 
			 System.out.println("Login is not successfull");
	}
}
