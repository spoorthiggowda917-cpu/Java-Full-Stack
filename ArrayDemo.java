package com.tnsif.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
	  String days[]=new String[7];
	  //days[0]="Monday";
	  //to get input from user
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<days.length;i++) {//input
		  System.out.println("Please enter the"+i+"th day of week");
		  days[i]=sc.nextLine();
		  
	  }
	  System.out.println("Days of the week are");
	  for(int i=0;i<days.length;i++) {//output
		  System.out.println(days[i]);
	  

	  }
	  sc.close();
	}
}
