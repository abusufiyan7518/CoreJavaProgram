package org.collectionframework.map;
//[advance type of methods used]

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(100, "rakesh");
		map.put(102, "Rahul");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}
}
