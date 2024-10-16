package com.java.inheritance;

// In this case one class is sending its properties to another single class

class Parent_SingleInheritance{
	
	int i=10;
	void m1()
	{
		System.out.println("m1() - Parent_SingleInheritance concept");
	}
}


class Child_SingleInheritance extends Parent_SingleInheritance{
	
	int j=20;
	
	void m2()
	{
		m1();
		System.out.println("m2() - Child_SingleInheritance concept");
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
}

public class Test2_SingleInheritance {
	
	public static void main(String[] args) {
		
		Child_SingleInheritance child_SingleInheritance = new Child_SingleInheritance();
		child_SingleInheritance.m2();
		
	}

}
