package com.lti.exception;

import java.io.FileReader;
import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		// int[] num = null;

		int[] num = { 1, 2, 3 };
		int[] num1 = { 10, 20, 30, 40, 50 };
		//System.out.println(new FileReader("fgfgg"));//checked excp
		// System.out.println(num1[9]);//if declared outside try block the compiler
		// doesnt say coz of it its a unchckd excep
		try {
			System.out.println(num[0]);// exception occured here ,it directly it jumps into catch block
			// System.out.println(num1[9]);
			System.out.println(num1[1]);
			// int n = 10 / 0;//java throws the exception and you catch it in catch block
			int n = 10 / 1;

		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("Array is not initialised");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "position not available");
		} finally {
			System.out.println("Finally executed");
		}
		int age = 0;
		System.out.println("Enter your age");
		age = new Scanner(System.in).nextInt();

		if (age < 0) {
			try {
				throw new NegativeAgeException("Age cannot be negative");
			} catch (NegativeAgeException e) {
                //e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} else {

			System.out.println("Your age is" + age + "years old");
		}

		System.out.println("Main ends");
	}

}
