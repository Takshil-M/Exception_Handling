package com.Questions.ExceptionHandling;

public class StringOutOfBound {

	public static void main(String[] args) {
		System.out.println("Hello");
		String str="Takshil";
		//char c=str.charAt(10);
		//System.out.println(c);
		try {
			char c=str.charAt(10);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
       System.out.println("everyone");
	}

}
