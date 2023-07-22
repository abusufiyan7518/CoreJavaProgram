package org.collection.list;

import java.util.ArrayList;

public class ArrayListExample10 {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Initial list of elements: " + al);//

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("Before invoking add(int index, E element) method: " + al);

		al.add(2, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");

		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + al);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("John");
		al3.add("Rahul");

		al.addAll(2, al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);

	}
}
