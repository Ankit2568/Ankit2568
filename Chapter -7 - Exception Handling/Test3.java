package com.java.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test3 {

	public static void m1() {
		System.out.println("Hello - 1");
		System.out.println("Hello - 2");
		System.out.println("Hello - 3");
		System.out.println("Hello - 4");
		
		try {
			System.out.println(10/0);	
					try {
						System.out.println(10/0);	
					}
					catch(Exception exception){}
					finally {}
			
		}
		catch(StringIndexOutOfBoundsException boundsException)
		{
			System.out.println("Please check the input");
			try {
				System.out.println(10/0);	
			}
			catch(Exception exception){}
			finally {}
		}
		
		finally
		{
			System.out.println("Hello - 5");
			System.out.println("Hello - 6");
			System.out.println("Hello - 7");
			System.out.println("Hello - 8");
			System.out.println("Hello - 9");
			try {
				System.out.println(10/0);	
			}
			catch(Exception exception){}
			finally {}
		}
		
		
		
		
	  
		
	}

	public static void m2() {

		Connection connection = null;
		try {
		
			Class.forName("oracle.jdbc.drivr.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
			System.out.println("Oracle Data Connection has been created Successfully");
		} 
		
		catch (ClassNotFoundException | SQLException exception) {
			System.out.println("Oracle connection has not been established successfully");
		}

		finally {
			try {
				connection.close();
				System.out.println("Connection has been closed successfully");
			} catch (SQLException exception) {

			}
		}

	}

	
	public void m3() {
		
		
		
	}

	
	
	
	public static void main(String[] args) {
		m2();

	}

}
