package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(2);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
