package org.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String args[]) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, " MK");
		map.put(1, " Anzar");
		map.put(2, " Abuzar");
		map.put(5, " Abuzar");
		System.out.println("HashMap : " + map);
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());

		}

		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(3, " ");
		map2.put(1, " Anzar");
		map2.put(2, " Abuzar");
		map2.put(4, " Abuzar");
		System.out.println("LinkedHashMap : " + map2);
		for (Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
		map3.put(3, " MK");
		map3.put(6, " Anzar");
		map3.put(2, " Abuzar");
		System.out.println("TreeMap : " + map3);
		for (Entry<Integer, String> entry : map3.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
