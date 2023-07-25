package org.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango"); 
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(3, "Sufiyan");
		map.put(4, "Apple"); 

		System.out.println("Iterating Hashmap...");
		for (Map.Entry<Integer,String>m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
