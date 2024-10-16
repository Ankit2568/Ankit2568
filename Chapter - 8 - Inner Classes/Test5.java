package com.java.innerclasses;

class A4{
	
	void m1()
	{
		class B4{
			
			void m2()
			{
				System.out.println("m2() - B4 - A4");
			}

			void m3()
			{
				System.out.println("m3() - B4 - A4");
			}
			
		}
		
		B4 b4 = new B4();
		b4.m2();
		b4.m3();
		
	}
	 
}

public class Test5 {
	
	public static void main(String[] args) {
		
		A4 a4 = new A4();
		a4.m1();
	}
	

}
