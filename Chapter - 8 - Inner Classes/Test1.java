package com.java.innerclasses;


class A{
	
	void m1()
	{
		System.out.println("m1() - A");
	}

	class B{
		
		static final int j = 20;
		
		void m2()
		{
			System.out.println("m2() - B - A");
		}

		void m3()
		{
			System.out.println("m3() - B - A");
		}
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		A.B ab =  new A().new B();
		ab.m2();
		ab.m3();
		
	}

}
