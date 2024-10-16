package com.java.factorymethod;
 
class A{
	
	private A()
	{
		System.out.println("A class constructor");
	}
	
	void m1()
	{
		System.out.println("m1() method Test1_FactoryMethod class");
	}
	
	// factory method
	static A getReference()
	{
		A a = new A();
		return a;
	}
	
}

public class Test1_FactoryMethod {
	
	public static void main(String[] args) {
		
		A a1 =  A.getReference();
		a1.m1();
	}
	
	/*
	 * static factory method
	 * ----------------------
	 * 
	 * Class c = Class.forName("A");
	 * NumberFormat numberFormat = NumberFormat.getInstance();
	 * ResourceBundle rb = ResurceBundle.getInstance()
	 * 
	 * 
	 * Instance Factory Method
	 * -----------------------
	 * String s1 = new String("Java Selenium");
	
		String s2 = s1.concat("Pune");
	 * 
	 */
	
	String s1 = new String("Java Selenium");
	
	String s2 = s1.concat("Pune");
	
	
	
	

}
