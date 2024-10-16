package com.java.overloadingoverriding;

class Demo1 {

	void m1() {
		System.out.println("No Argument method");
	}

	void m1(int i) {
		System.out.println("int Argument method");
	}

	void m1(int i, double d1) {
		System.out.println("int double Argument method");
	}
}

class Demo2 {

	int sum() {
		return 0;
	}

	int sum(int a) {
		return a;
	}

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}

public class Test1 {

	public static void main(String[] args) {

		/*
		Demo1 demo1 = new Demo1();
		demo1.m1(); // No Argument method
		demo1.m1(10);// int Argument method
		demo1.m1(10, 20);// int double Argument method
		*/
		
		Demo2 demo2 = new Demo2();
		System.out.println(demo2.sum());;
		System.out.println(demo2.sum(10));;
		System.out.println(demo2.sum(10,20));;
		System.out.println(demo2.sum(10,20,30));;
		System.out.println(demo2.sum(10,20,30,40));;
		System.out.println(demo2.sum(10,20,30,40,50));;
	}
}
