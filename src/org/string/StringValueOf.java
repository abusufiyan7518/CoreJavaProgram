package org.string;

public class StringValueOf {
	int id;
	String name;

	StringValueOf(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " : " + name);
	}

	public static void main(String[] args) {
		StringValueOf example = new StringValueOf(101, "Abu Sufiyan");
	}
}
