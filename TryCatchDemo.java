package com.tnsif.exception_handling;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("i am main Method");
		int result;
		try {
			/*try → Used to enclose code that might throw an exception (error during runtime).
			If any exception occurs, control jumps to the catch block.*/
			result=TryCatch.performDivision(12, 0);
			if(result!=0) {
				System.out.println("Division is"+result);
				System.out.println("----------------------------");
			}
			result=TryCatch.performDivision(12, 3);
			if(result!=0) {
				System.out.println("Division is"+result);
				System.out.println("----------------------------");
			}
		}catch(Exception e) {
			/*catch → This block catches and handles exceptions from the try block.
			if number=>(ArithmeticException e) or else(Exception e)=> e is variable,
			Exception is the parent class of all exceptions in Java.*/
			System.out.println(TryCatch.performDivision(12f, 15f));
			System.out.println("----------------------------");
			System.out.println(TryCatch.performDivision(12f, 0f));
			//For floats, dividing by zero does not cause an error — it results in Infinity.
			
		}
		

	}

}
