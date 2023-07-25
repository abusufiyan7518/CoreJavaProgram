package org.collectionframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String>map = new HashMap<>();

		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");

		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
