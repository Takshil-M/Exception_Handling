package com.Questions.ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {


		System.out.println("Main Begain");
		int a=10;
		int b=0;
		try {
			int res =a/b;
			System.out.println(res);
			
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Main End");
		

	}

}
