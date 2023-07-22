package org.string;

public class StringSubstring {
	public static void main(String[] args) {

		String s1 = "Hindustan Petroleum";
		String substr = s1.substring(0);
		System.out.println(substr);
		String substr2 = s1.substring(10, 16);
		System.out.println(substr2);
		try {
			String substr3 = s1.substring(5, 25);
		} catch (Exception e) {
			System.out.println("Finally Run");
			System.out.println(e);

		}
	}
}
