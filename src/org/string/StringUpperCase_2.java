package org.string;

public class StringUpperCase_2 {
	public static void main(String[] args) {

		String s1 = "Upper case me change ho gya";
		if (s1.contains("change")) {
			String s1upper = s1.toUpperCase();
			System.out.println(s1upper);
		} else {
			String s1lower = s1.toLowerCase();
			System.out.println(s1lower);
		}
	}

}
