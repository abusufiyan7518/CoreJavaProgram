package org.string;

public class StringSplit {
	public static void main(String args[]) {

		String s1 = "java string split method by javatpoint";

		String[] words = s1.split("method");

		for (String w : words) {

			System.out.println(w);
		}
	}
}
