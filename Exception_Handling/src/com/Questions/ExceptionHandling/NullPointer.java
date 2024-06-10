package com.Questions.ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		
		System.out.println("Programme Stated");
		String a=null;
	//	System.out.println(a.charAt(0));

		try {
			System.out.println(a.charAt(0));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("exception handled");
	}

}
