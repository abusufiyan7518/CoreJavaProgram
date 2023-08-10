package org.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Abusufiyan");
		/*
		 * set.add("Abuzar"); set.add("Ansarul"); set.add("Shoyeb"); set.add(null);
		 */
		System.out.println(set);
		
		Set<String> newset = new HashSet<>();
		newset.add("Abusufiyan");
		
		System.out.println(newset);
		/*
		 * newset.add("Hamza"); newset.add("Zaid"); newset.add("Imran");
		 * newset.add("Nissu"); set.addAll(newset)
		 */;
		/*
		 * Iterator<String> itr = set.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
	}
}
