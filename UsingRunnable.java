package com.tnsif.multithreading;

public class UsingRunnable implements Runnable {
	int h,l;
	String msg;
	
	public UsingRunnable(int l,int h,String msg) {
		this.h=h;
		this.l=l;
		this.msg=msg;
	}
	
	@Override
	public void run() {
		for(int i=l;i<=h;i++) {
			try {
				Thread.sleep(500);//sleep method is a method which may a throw a interrupter exception.
				//sleep method is used for delayed output.
			}catch(InterruptedException ie) {
				System.err.println("Error:"+ie.getMessage());
			}
			System.out.println(msg+i);
			}
		}
	
	}

