package com.tnsif.staticdemo;

public class MyClass {
	
	private int section;//non-static or instance variable.
	private static int srNo;//static or class variable.
	static
	{
		//This is a static block.
		//It runs only once, when the class is loaded into memory (before any object is created).
		System.out.println("--------Within Static Block--------");
		srNo=1000;
	}
	//default constructor
	//This is the constructor of the class.
	//It runs every time you create a new object.
	MyClass(){
		System.out.println("--------Within default Block--------");
		srNo++;
		section++;
		
	}
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+",section=" + section + "]";
	}
	//static method
	//This is a static method, so:
    //It belongs to the class.
    //You can call it without creating an object — like MyClass.display();
    //It can only use static variables (like srNo), not instance variables (like section).
	static void display()
	{
		System.out.println("Serial no."+srNo);
	}
	}
	                      


