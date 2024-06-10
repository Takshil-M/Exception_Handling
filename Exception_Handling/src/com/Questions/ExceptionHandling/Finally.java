package com.Questions.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Main Staeted");
		int a=10;
		int b=0;
		finally {
			
			try {
				int res=a/b;
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main End");
	}

}
