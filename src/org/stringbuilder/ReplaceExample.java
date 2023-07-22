package org.stringbuilder;

public class ReplaceExample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Welcome");
		str.replace(0, 4, "H");
		System.out.println(str);
	}

}
