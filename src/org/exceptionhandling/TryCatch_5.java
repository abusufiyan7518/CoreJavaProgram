package org.exceptionhandling;

public class TryCatch_5 {

	public static void main(String[] args) {

		System.out.println("'Exception not found'");
		System.out.println("Before divide");

		try {
			int a = 10 / 0;
			System.out.println("After divide");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("A number cannot be divided by zero");

	}

}
