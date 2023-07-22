package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample3 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");

		System.out.println("first index element: " + al.get(2));

		al.set(2, "Zeeshan"); // Apple change with zeeshan
		al.add("AbuSufiyan");
		Collections.sort(al);
		for (String f : al)
			System.out.println(f);

	}
}
