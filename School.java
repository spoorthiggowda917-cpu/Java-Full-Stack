package com.tnsif.scanner;

public class School {
	public static int a=5;
	public int b=10;
	
	public static void m1() { 
		//non static membrane can't be accessed in static method
		//System.out.println(b);
		System.out.println(a);
		
	}
	
	public void m2() {
		System.out.println(b); //✅ Works (non-static)
        System.out.println(a);  // ✅ Works (static)
		
	}
//	public void m2(int a) {	
//	} both are diff bcz of parameter
	static {
		System.out.println("Hi,kjhhhhhhgtfr");
	}
	public static void main(String args[]) {
		 School s = new School();
	        s.m2();
	        m1();
		
	}

}
