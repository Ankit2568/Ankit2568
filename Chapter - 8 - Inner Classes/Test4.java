package com.java.innerclasses;

class A3{
	
	static class B3 
	{
		public void m1()
		{
			System.out.println("m1 - B3 - A3");
		}
		public void m3()
		{
			System.out.println("m3 - B3 - A3");
		}
		
		public void m2()
		{
			System.out.println("m2 - B3 - A3");
		}
		
	}
}

public class Test4 {
	
	public static void main(String[] args) {
		
		 A3.B3 ab3 =  new A3.B3();
		 ab3.m1();
		 ab3.m2();
		 ab3.m3();
	}
	

}
