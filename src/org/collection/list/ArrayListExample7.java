package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample7 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AbuZar");
		list.add("Mubassir");
		list.add("Zeeshan");
		list.add("AbuSufiyan");

		System.out.println("Traversing list through List Iterator:");

		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			System.out.println(list1.previous());
		}
		
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Traversing list through forEach() method:");

		list.forEach(a -> System.out.println(a));
		
		System.out.println("Traversing list through forEachRemaining() method:");

		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> System.out.println(a));
	}

}
