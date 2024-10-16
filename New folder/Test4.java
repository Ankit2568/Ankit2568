package com.java.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		
		//Vector
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		
		Enumeration<Integer> element  = vector.elements();
		while (element.hasMoreElements()) {
			System.out.println(element.nextElement());
			
		}
		
		
		
	}
	
	
}
