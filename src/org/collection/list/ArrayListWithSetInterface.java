package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListWithSetInterface {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Sufiyan");
		al.add("Sufiyan");
		al.add("ABUSufiyan");
		al.add("Saki Naka");
	             	Collections.sort(al);
		System.out.println(al);
		Set<String> s = new HashSet<>(al);
		
		System.out.println(s);
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {                    System.out.println(itr.next());
		}
	}
}