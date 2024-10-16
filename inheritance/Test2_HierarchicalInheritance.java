package com.java.inheritance;

// In this case one class is sending its properties to another single class

class Parent_Hierarchical{

	void parent()
	{
		System.out.println("m1() in Parent_Hierarchical");
	} 
}



class Child1 extends Parent_Hierarchical{

	void c1()
	{
		System.out.println("c1() in Child1");
	}
}

class Child2 extends Parent_Hierarchical
{
	void c2()
	{
		System.out.println("c2() in Child2");
	}
}


class Child3 extends Parent_Hierarchical
{
	void c3()
	{
		System.out.println("c3() in Child3");
	}
}

public class Test2_HierarchicalInheritance {
	
	public static void main(String[] args) {
		 
		System.out.println("Methods Present in Child1 class");
		Child3 child3 = new Child3();
		child3.parent();
		child3.c3();
		
		System.out.println("Methods Present in Child2 class");
		Child2 child2 = new Child2();
		child2.parent();
		child2.c2();
		
		 
		
		
	}

}
