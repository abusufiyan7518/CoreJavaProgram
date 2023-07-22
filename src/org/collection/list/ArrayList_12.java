package org.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        
		list.ensureCapacity(5);
		list.add("Object");
		list.add("Class");
		list.add("Inheritance");
		list.add("Polymorphism");
		list.add("Abstraction");
		list.add("Class");
		list.add("Encapsulation");
		
		System.out.println("Before add element:" + list);

		ArrayList<String> list1 = new ArrayList<String>();
        //list1.ensureCapacity(20);

		list1.add("Single Level");
		list1.add("Multi Level");
		list1.add("Heirarichal");
		list1.add("Multiple");
		list1.add("Hybrid");

		System.out.println("After add element:" + list1);

		System.out.println(list.addAll(list1));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println(list1.remove(1));
		System.out.println(list1.removeAll(list));

	}
}
