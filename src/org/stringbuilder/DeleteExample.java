package org.stringbuilder;

public class DeleteExample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Welcome");
		str.delete(1, 6);
		System.out.println(str);
	}

}
