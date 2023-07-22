package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListExample12 {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
	
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add("Vijay");

		al.retainAll(al2);
		al.addAll(al2);
		System.out.println("iterating the elements after retaining the elements of al2");
		System.out.println(al);
		
		Set<String> al3=new LinkedHashSet<String>(al);
	
		

		Iterator<String> itr = al3.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
