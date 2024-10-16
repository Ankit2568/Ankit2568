package com.java.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
			
			
		 // HashSet
		   	HashSet<String> hashSet = new HashSet<String>();
		   	hashSet.add("one");
		   	hashSet.add("two");
		   	hashSet.add("three");
		   	hashSet.add("four");
		   	hashSet.add("one");
		   	hashSet.add(null);
		   	
		   	System.out.println(hashSet);
		   	hashSet.remove("three");
		   	System.out.println(hashSet);
		   	
		   	Iterator<String> iterator = hashSet.iterator();
		   	while(iterator.hasNext())
		   	{
		   		System.out.println(iterator.next());
		   	}
	}
}
