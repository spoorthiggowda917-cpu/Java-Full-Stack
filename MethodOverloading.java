package com.tnsif.polymorphism;

class calculatorlogic{
	//same number of arguments with different method
	int add(int a,int b) {
		return a+b;
		
	}
	double add(double a,double b) {
		return a+b;
		
	}
	//different number of arguments with same method
	int add(int a,int b,int c) {
		return a+b+c;
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		calculatorlogic calc=new calculatorlogic();
		System.out.println("add(int,int):"+calc.add(5, 10));
		System.out.println("double(double,double):"+calc.add(5.5, 10.2));
		System.out.println("add(int,int,int):"+calc.add(3, 20,8));
	}

}
