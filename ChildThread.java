package com.tnsif.multithreading;
import java.lang.Thread;

public class ChildThread extends Thread{
	private int n;
	private String msg;
	
	public ChildThread(int n,String msg) {
	this.n=n;//Copies the temporary input value into the object’s permanent variable.
	this.msg=msg;
	}

	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(3000);//sleep method is a method which may a throw a interrupter exception.
				//sleep method is used for delayed output.
			}catch(InterruptedException ie) {
				System.err.println("Thread interrupted:"+ie.getMessage());
				Thread.currentThread().interrupt();
				
			}
			System.out.println(msg+i+""+Thread.currentThread().getName());
		}
		
	}

}
