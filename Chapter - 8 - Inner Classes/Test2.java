package com.java.innerclasses;

class A1{
	
	class B1{
		
		void m1()
		{
			System.out.println("m1 - B1 - A1");
		}
		
		void m2()
		{
			System.out.println("m2 - B1 - A1");
		}
		
	}
	
	
	class C1 extends B1
	{
		void m3()
		{
			System.out.println("m3 - C1 - A1");
		}
		
		void m4()
		{
			System.out.println("m4 - C1 - A1");
		}
		
	}
	
	
}

public class Test2 {
	
	public static void main(String[] args) {
		
		 A1.B1 ab = new A1().new B1();
		 ab.m1();
		 ab.m2();
		 
		 A1.B1 ab1 = new A1().new C1();
		 ab1.m1();
		 ab1.m2();
		 
		 A1.C1 ab2 = new A1().new C1();
		 ab2.m1();
		 ab2.m2();
		 ab2.m3();
		 ab2.m4();
	}
	

}
