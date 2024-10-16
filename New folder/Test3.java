package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		
		//LinkedList
		LinkedList<Integer> ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		System.out.println(ll);
		
		ll.add(1,15);
		System.out.println(ll);
		
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		
	}
	
	
}
