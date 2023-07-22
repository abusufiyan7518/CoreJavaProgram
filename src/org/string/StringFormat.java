package org.string;

public class StringFormat {
	public static void main(String args[]) {

		String name = "sonoo"; // literal

		String sf1 = String.format("name is %s", name);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %32.10f", 32.33434); // 12.8467352542

		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}
}
