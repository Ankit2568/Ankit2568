package com.java.inheritance;

// In this case one class is sending its properties to another single class

class GrandParent{

	void m1()
	{
		System.out.println("m1() in GrandParent");
	} 
	void m5()
	{
		System.out.println("m5() in GrandParent");
	}
}



class Parent extends GrandParent{

	void m2()
	{
		System.out.println("m2() in Parent");
	}
	
	void m5()
	{
		System.out.println("m5() in Parent");
	}
}

class Child extends Parent
{
	void m3()
	{
		System.out.println("m3() in Child");
	}
	
	void m5()
	{
		System.out.println("m5() in Child");
	}
}

public class Test2_MultilevelInheritance {
	
	public static void main(String[] args) {
		 
		/*
		System.out.println("Methods Present in Child class");
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		
		System.out.println("Methods Present in Parent class");
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
		
		System.out.println("Methods Present in GrandParent class");
		GrandParent grandParent = new GrandParent();
		grandParent.m1();
		
		*/
		Parent parent2 = new Child();
		parent2.m2();
		parent2.m5();
		//parent2.m10;
		
		 
		
		
				
	}

}







