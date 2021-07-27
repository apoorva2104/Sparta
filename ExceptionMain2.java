package com.lti.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		// int[] num = null;

		int[] num = { 1, 2, 3 };
		int[] num1 = { 10, 20, 30, 40, 50 };

		try {
			System.out.println(num[0]);//exception occured here ,it directly it jumps into catch block
			System.out.println(num1[9]);
			int n = 10 / 0;

		} catch (NullPointerException e) {
			 //e.printStackTrace();
			System.out.println("Array is not initialised");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "position not available");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main ends");
	}

}
