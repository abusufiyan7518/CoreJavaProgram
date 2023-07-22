package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();

		l.add("Mango");
		l.add("Banana");
		l.add("Mango");
		l.add("Apple");
		l.add("Guava");
		l.add("Pomogrannate");
		l.add("Pineapple");
		l.add("PomoGrannate");

		System.out.println(l.toString());

		Set<String> s = new LinkedHashSet<String>(l);
		System.out.println(s);
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		}

}
