package com.Questions.ExceptionHandling;

public class ClassNotFound {

	public static void main(String[] args) {
		
		System.out.println("hello");
		//Class.forName("ClassNotFound");
		try {
			Class.forName("ClassNotFound");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
