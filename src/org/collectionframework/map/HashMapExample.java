package org.collectionframework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String args[]) {
		
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(3, "MK");
		m1.put(1, "Anzar");
		m1.put(2, "Abuzar");
		m1.put(5, "Abuzar");
        System.out.println("HashMap : "+m1);
        
		LinkedHashMap<Integer, String> m2 = new LinkedHashMap<Integer, String>();
		m2.put(3, "MK");
		m2.put(1, "Anzar");
		m2.put(2, "Abuzar");
		m2.put(4, "Abuzar");
        System.out.println("LinkedHashMap : "+m2);
        
		TreeMap<Integer, String> m3 = new TreeMap<Integer, String>();
		m3.put(3, "MK");
		m3.put(6, "Anzar");
		m3.put(2, "Abuzar");
        System.out.println("TreeMap : "+m3);
	}
}
