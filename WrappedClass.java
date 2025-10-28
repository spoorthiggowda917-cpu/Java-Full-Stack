package com.tnsif.staticdemo;

public class WrappedClass {

	public static void main(String[] args) {
		float f=22.22f;
		//Wrapped 
		Float obj=f;
		//Unwrapped
		float f1=obj.floatValue();
		System.out.println(obj);
		System.out.println(f1);

	}

}
