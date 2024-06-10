package com.Questions.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFound {

	public static void main(String[] args) {
		
		try {
			FileOutputStream obj = new FileOutputStream ("C:\\Users\\taksh\\Desktop");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
