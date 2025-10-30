package com.tnsif.multithreading;

public class RunnableDemo {
/*	┌────────────────────────────────────┐
	│ Main Thread (RunnableDemo.main)    │
	│  │                                 │
	│  ├── Creates UsingRunnable t1,t2   │
	│  ├── Creates Threads t, th         │
	│  ├── Starts t, th →                │
	│  │      ├── t runs t1.run()        │
	│  │      └── th runs t2.run()       │
	│  ├── join() → waits for both       │
	│  └── Ends after both finish        │
	└────────────────────────────────────┘*/

	public static void main(String[] args) {
		//These are two independent task objects that implement Runnable
		UsingRunnable t1=new UsingRunnable(1, 5, "thread1");
		UsingRunnable t2=new UsingRunnable(1, 10, "thread2");
		
		//Using thread class
		Thread t=new Thread(t1);
		Thread th=new Thread(t2);
	    t.start();
		th.start();
		
		try {
			t.join();
			th.join();
			
		}catch(InterruptedException ie) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted:" + ie.getMessage());
		
			
		}
		//Anonymous class
//		Runnable runnable=new Runnable() {
//			@Override
//			public void run() {
//				System.err.println("Runnable with anonymous class");
//				
//				Thread t=new Thread(runnable);
//				t.start();
//			}
//			
//		};
		//lambda expression
//		Runnable runnable = () -> {
//            System.out.println("Runnable with lambda expression");
//        };
//
//        new Thread(runnable).start();
		

	}

}
