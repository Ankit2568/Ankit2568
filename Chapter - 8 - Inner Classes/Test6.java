package com.java.innerclasses;

abstract class A5{
	
	void m1()
	{
		System.out.println("m1() - A5");
	}
	abstract void m2();
	abstract void m3();
}

class Outer
{

	A5 a5 = new A5() {
		
		void m2()
		{
			System.out.println("m2() - Outer");
		}
		
		void m3()
		{
			System.out.println("m3() - Outer");
		}
		
		void m4()
		{
			System.out.println("m4() - Outer");
		}
	};
}

public class Test6 {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.a5.m1();
		outer.a5.m2();
		outer.a5.m3();
		//outer.a5.m4();
	 
	}
	

}
