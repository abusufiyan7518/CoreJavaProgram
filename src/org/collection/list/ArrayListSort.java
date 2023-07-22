package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(30);

		Collections.sort(list);
		list.add(40);
		list.add(24);
		list.add(44);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(11);
		for (Integer a : list) {
			System.out.println(a);

		}
		System.out.println(list1);
	}
}
