package org.exceptionhandling;

public class Demo_Exeption {

	public static void main(String[] args) {

		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("Done");
	}
}
