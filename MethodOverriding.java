package com.tnsif.polymorphism;

//parent class
class Payment {
	void makePayment() {
		System.out.println("Processing payment using generic method");
	}
}
//can use methods of parent class
class UpiPayment extends Payment {
	void makePayment() {
		System.out.println("Payment using UPI method");
	}
}

class CardPayment extends Payment {
	void makePayment() {
		System.out.println("Payment using Card method");
	}
}

class Wallet extends Payment {
	void makePayment() {
		System.out.println("Payment using Wallet method");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		//Create a reference variable named payment that can hold the address of a Payment object or any of its subclasses
		Payment payment;

		payment = new UpiPayment();
		payment.makePayment();

		payment = new CardPayment();
		payment.makePayment();

		payment = new Wallet();
		payment.makePayment();
	}
}
