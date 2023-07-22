package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Mango");
		list.add("Pineapple");
		list.add("Guava");

		Collections.sort(list);
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
