
package com.tnsif.multithreading;

public class ThreadLifeCycle extends Thread{
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int num = 0;
		while (num < 4) {
			num++;
			System.out.println("num = " + num);
			try {
				sleep(500);
				System.out.println("In not runnable stage, Thread is alive or not? " + this.isAlive());
				//Even when the thread is sleeping (temporarily not runnable), isAlive() still returns true,
				//because the thread hasn’t finished executing — it’s just paused.
			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}

	public static void main(String[] args) {
		Thread myThread = new ThreadLifeCycle();
//You’re storing the new ThreadLifeCycle object in a variable named myThread of type Thread.
//This is possible because ThreadLifeCycle is a subclass of Thread, so it can be referenced by a Thread variable
		System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException exp) {
			System.err.println("Thread is interrupted !");
		}

		System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
	}
}
