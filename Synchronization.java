package com.tnsif.multithreading.synchronization;

public class Synchronization {

	public static void main(String[] args) {
		Account a1=new Account(121,"spoorthi",53800);//created account
		//creating  account threads representing as many users using 1 account.
		AccountThread t1=new AccountThread(a1,10000);
		AccountThread t2=new AccountThread(a1,20000);
		AccountThread t3=new AccountThread(a1,30000);
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a1);
	}

}
