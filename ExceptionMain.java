package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain {
	static int res = 0;
	static int[] arr = new int[] { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {
		int num1, num2, pos;
		Scanner sc = new Scanner(System.in);

		System.out.println("The main begins");
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println(divide(num1, num2));

		System.out.println("Enter the position");
		pos = sc.nextInt();

		// System.out.println(getElement(pos));
		int value = getElement(pos);
		if (value != 0) {
			System.out.println(value);
		}

		System.out.println("The main ends");

	}

	public static int divide(int num1, int num2) {
		try {
			res = num1 / num2;
			//return res;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			System.out.println("cannot "+e.getMessage());
		}
		return res;
	}

	public static int getElement(int index) {
		int value = 0;
		try {
			//return arr[index];
			value = arr[index];
		} catch (Exception e) {
			System.out.println("Position not found");
		}
		return value;
	}
}
