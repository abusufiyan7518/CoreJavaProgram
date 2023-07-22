package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("AbuBakar");
		list.add("AbuSufiyan");
		list.add("Mubassir");
		list.add("Zeeshan");
		list.add("AbuBakar");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
