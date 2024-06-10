package com.Questions.ExceptionHandling;

public class Throw {

	
public static void vote(int age) {
	if(age >=18){
		System.out.println("Vote and Go Home");
		
	}
	else {
		
		//create exception that is Object creation for exception class
		throw new ArithmeticException("Be in Home");
		
	}
}
	
	
	public static void main(String[] args) {
		System.out.println("welcome");
		vote(12);
		System.out.println("Bye Bye");

	}

}
