package com.tnsif.collection;

import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(50);
		v.add("Spoorthi");
		
		Iterator v1=v.iterator();
		/*👉 In Java, the Vector class provides two common ways to iterate:
		   Using Iterator
		   Using ListIterator*/
		while(v1.hasNext()) {
			System.out.println(v1.next());
		}

	}

}
