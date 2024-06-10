package com.Questions.ExceptionHandling;

public class ArthmaticExcep {

	public static void main(String[] args) {
		
		System.out.println(1);
		int a=10;
		int b=0;
		//int res=a/b;
		try {
			int res=a/b;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
       System.out.println(2);
	}

}
