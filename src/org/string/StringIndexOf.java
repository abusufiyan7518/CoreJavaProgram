package org.string;

public class StringIndexOf {

	public static void main(String args[]) {
		String s1 = "this is index of example";

		int a = s1.indexOf("is");
		int b = s1.indexOf("index");
		System.out.println(b + "  " + a);

		int index3 = s1.indexOf("i", 5);
		System.out.println(index3);

		int index4 = s1.indexOf('i');
		System.out.println(index4);
	}
}
