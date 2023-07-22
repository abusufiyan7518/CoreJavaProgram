package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(); // creating arrayList

		list.add("Zeeshan");
		list.add(null);
		list.add("AbuBakar");
		list.add("Muhafiz");
		list.add("Zeeshan");
		list.add("Anzar");
		
		Collections.sort(list);
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Done");
	}

}
