package org.collection.list;

import java.util.ArrayList;

public class ArrayListCheck {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(1);
		System.out.println("ArrayList Size: " + a.size());

	}

}
