package com.tnsif.multithreading;

public class ThreadMethod {
	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First"); // creating child thread object
		ChildThread t2 = new ChildThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
		
		t1.start();
		t2.start();
		Thread.currentThread().setName("Parent Thread"); // assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread
		/*The main thread changes its name to "Parent Thread".
		It also sets its priority to the lowest possible value (1) using Thread.MIN_PRIORITY.*/
		System.out.println("Current Thread: " + Thread.currentThread());
		// Thread.currentThread() returns the thread currently running this code → the main thread.
		
		try {
			t1.join(); // wait current thread until t1 is dead
			t2.join(300); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt(); // Restore interrupted status
			System.err.println("Thread interrupted: " + e.getMessage());
		}
		System.out.println("-----------------------End of Main--------------------------");
	}

	}


/*Main Thread (Parent Thread)
│
├── Creates t1, t2
│
├── Starts t1, t2  ──────────────┐
│                                │
│                    ┌───────────┴───────────┐
│                    │                       │
│              Child Thread t1         Child Thread t2
│              (prints First..)        (prints Second..)
│                    │                       │
│                    └───────────┬───────────┘
│                                │
│←────────── join(t1) ───────────┘  (wait until t1 finishes)
│
│←── join(t2,300) ──→ wait for t2 max 300 ms
│
└── Prints "End of Main".

output=>Thread[name, priority, threadGroupName]*/

