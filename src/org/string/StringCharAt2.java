package org.string;

public class StringCharAt2 {

	public static void main(String[] args) {

		String str = "Welcome to Javatpoint portal";

		int strLength = str.length();
		System.out.println(strLength);
		System.out.println("Character at 0 index is: " + str.charAt(0));

		System.out.println("Character at last index is: " + str.charAt(strLength - 2));
	}
}
