package org.collection.list;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Apple");

		for (String f : list) // for-each
			System.out.println(f);

	}

}
