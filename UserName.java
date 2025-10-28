package com.tnsif.scanner;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Scanner is a built-in Java class used to take input from the user.
		//System.in means you’re taking input from the keyboard.
		System.out.println("Enter your name");
		String name=sc.nextLine();//sc.nextLine() waits for the user to type something and press Enter.
		System.out.println("Hello "+ name);
		
	}

}
