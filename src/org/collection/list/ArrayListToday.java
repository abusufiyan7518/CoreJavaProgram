package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ArrayListConcurrentModificationException {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List Value Before Iteration:" + list);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			if (value.equals(3))
				list.remove(value);
			List<Integer> li = new CopyOnWriteArrayList<>(list);
			System.out.println("List Value After Iteration:" + li);
		}
		
	}
}