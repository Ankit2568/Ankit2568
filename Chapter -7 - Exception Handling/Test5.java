package com.java.exceptionHandling;

import java.io.IOException;

public class Test5 {

	public static void concat() throws IOException
	{
		throw new IOException("This is Pure Checked Exception");
	}
	
	public static void add() throws Exception
	{
		concat();
	}
	
	
	
	public static void main(String[] args)throws Exception  {
		 
	add();

	}

}
