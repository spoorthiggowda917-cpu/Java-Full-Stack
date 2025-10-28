package com.tnsif.multithreading;

public class Threads {
	
	public static void main(String[] args) {
		ChildThread t1=new ChildThread(5,"First");//creating child thread object
		ChildThread t2=new ChildThread(10,"Second");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();//to stop main thread.join() tells the main thread:
			//"Wait here until this thread finishes".
			t2.join();
		}catch(InterruptedException ie) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted"+ie.getMessage());
		}
		System.out.println("---------------------End of Main------------------");
		
	}

}
