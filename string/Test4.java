package com.java.string;


class Student
{
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	public boolean equals(Student test)
	{
		return (test.name).equals(this.name) && test.id == this.id;
	}
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Anand");
		Student student2 = new Student(2, "Shivam");
		Student student3 = new Student(1, "Anand");
		Student student4 = student1;
		
		System.out.println(student1 == student2); // false
		System.out.println(student1 == student3); // false
		System.out.println(student1 == student4); // true 

		System.out.println(student1.equals(student2)); // false
		System.out.println(student1.equals(student3)); // true
		System.out.println(student1.equals(student4)); // true

		
	}

}
