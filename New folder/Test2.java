package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test2 {

	public static void main(String[] args) {
		
		 //ArrayList
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		/*
		 * for(int i=0; i<al.size(); i++) { System.out.println(al.get(i)); }
		 */
		
		/*
		 * for( Object obj : al) { System.out.println(obj); }
		 */
		
		/*
		 * Iterator iterator = al.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		
		/*
		 * ListIterator iterator = al.listIterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		
		
		//lambda expression
		al.forEach(i -> {
			System.out.println(i);
		});
		
	}
	
	
}
