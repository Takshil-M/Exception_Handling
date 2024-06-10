package com.Questions.ExceptionHandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		System.out.println("Begin");
		int a[] = new int [5];
	//System.out.println(a[7]);
		
		try {
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
        System.out.println("end");
	}

}
