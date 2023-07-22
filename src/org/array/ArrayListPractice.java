package org.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Sufiyan");
		al.add("Munna");
		al.add("Ansarul");
		System.out.println(al.size());

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Imran");
		al1.add("Ahtesham");
		System.out.println(al.size());

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Zaid");
		al2.add("Shoyeb");
		al2.add("Zaid");
		System.out.println(al.size());

		ArrayList<String> al3 = new ArrayList<>();
		al3.add("Nissu");
		System.out.println(al.size());

		ArrayList<String> al4 = new ArrayList<>();
		al4.add("Anzar");
		al4.add("Abuzar");
		System.out.println(al.size());

		System.out.println("After add al & al1");
		System.out.println("BEFORE ADD al1 size: " + al1.size());
		System.out.println(al.addAll(al1));
		System.out.println(al);
		System.out.println("After add al1 size: " + al.size());

		System.out.println("After add al2 in al");
		System.out.println(al.addAll(al2));
		System.out.println(al);
		System.out.println(al.size());

		System.out.println("After add al3 in al");
		System.out.println(al.addAll(al3));
		System.out.println(al);
		System.out.println(al.size());

		System.out.println("After add al4 in al");
		System.out.println(al.addAll(al4));
		System.out.println(al4);
		System.out.println(al.size());

		Collections.sort(al);
		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
