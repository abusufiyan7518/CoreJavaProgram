package org.exceptionhandling;

public class WithoutTryBlock {

	public static void main(String[] args) {
		System.out.println("'No Exception Found' ");
		System.out.println("Before divide");
		System.out.println("After divide");
		int x = 1 / 0;
		System.out.println("After divide");
		System.out.println("1");
		System.out.println("Kuch nhi ho rha GUYS");

	}

}
