package com.Questions.ExceptionHandling;

public class TryInsideTry {

	public static void main(String[] args) {
		System.out.println("prograame start");
		int a=10;
		int b=0;
		try {
			
		}
		finally {
			try {
				int res=a/b;
			}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		

	}
		System.out.println("Prograame End");
	}
}
