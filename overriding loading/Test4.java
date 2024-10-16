package com.java.overloadingoverriding;

class Parent
{
	static void m1()
	{
		System.out.println("m1() method in Parent class");
	}
}

class Child extends Parent
{
	static void m1()
	{
		System.out.println("m1() method in Child class");
	}

}

public class Test4 {
	
	public static void main(String[] args) {
		
		/*
		 * Parent parent = new Parent(); parent.m1();
		 * 
		 * Child child = new Child(); child.m1();
		 */
		
		Parent parent2 =  new Child();
		parent2.m1();
	}
}
