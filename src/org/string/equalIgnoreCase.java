package org.string;

public class equalIgnoreCase {

	public static void main(String[] args) {
		String s1 = "Sufiyan";
		String s2 = "Shoyeb";
		String s3 = "SUFIYAN";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
	}

}
