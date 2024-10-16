package com.java.innerclasses;

class A2{
	
	interface I1{
		
		void m1();
		void m2();	
		void m3();
	}
	
	
	class B2 implements I1
	{
		public void m1()
		{
			System.out.println("m1 - B2 - A2");
		}
		public void m3()
		{
			System.out.println("m3 - B2 - A2");
		}
		
		public void m2()
		{
			System.out.println("m2 - B2 - A2");
		}
		
	}
}

public class Test3 {
	
	public static void main(String[] args) {
		
		A2.I1 ai = new A2().new B2();
		ai.m1();
		ai.m2();
		ai.m3();
	
	}
	

}
