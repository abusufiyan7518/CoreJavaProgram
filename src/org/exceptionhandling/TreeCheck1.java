package org.exceptionhandling;

public class TreeCheck1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Lucky");
		System.out.println("Chhora");
		System.out.println("please");
		System.out.println("Welcome");
		System.out.println(100 / 50);
		System.out.println("Exception are coming");
		try {
			System.out.println(100 / 0);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception aa rela re bhai");
			System.out.println("Kuch to Gadbad hai Daya");
		}
		System.out.println("Out of Catch block");

	}

}
