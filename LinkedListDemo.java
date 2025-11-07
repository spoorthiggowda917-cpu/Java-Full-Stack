package com.tnsif.collection;

import java.util.LinkedList;
import java.util.ListIterator;
//Iterator=>An iterator in Java is an object that allows you to traverse (go through/cursor/tool) a collection one element at a time.

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add("hi");
		
		l.removeFirst();
		ListIterator li=l.listIterator();//listIterator() → gives you a tool to walk through your list.
		while(li.hasNext()) {
			System.out.println(li.next());
			/*li.hasNext() checks whether there is another element ahead in the list.
			 * It returns true if at least one element is left to visit.
			 * The loop continues as long as there’s a next element.*/
		}
		
		l.addLast(22.2f);
		System.out.println(l);
		
	}

}
