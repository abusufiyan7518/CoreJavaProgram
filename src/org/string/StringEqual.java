package org.string;

public class StringEqual {

	public static void main(String[] args) {
		String s = "Mubassir";
		String s1 = "Sufiyan";
		String s2 = "mUbassir";

		System.out.println(s.equals(s1));

		System.out.println(s.equalsIgnoreCase(s2));
	}

}
