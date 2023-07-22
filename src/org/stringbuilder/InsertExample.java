package org.stringbuilder;

public class InsertExample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Welcome");
		str.insert(0, "Sir ");
		System.out.println(str);
	}

}
