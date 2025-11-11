package com.tnsif.collections.queue;

import java.util.Queue;
import java.util.PriorityQueue; 

public class PriorityQueuedemo {
	
	public static void main(String[] args) {
		Queue<String> pq=new PriorityQueue<String>();
		
		pq.add("Spoo");
		pq.add("Swathi");
		pq.add("vaish");
		pq.add("vidya");
		pq.add("poothi");
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);
		
		
	}

}
