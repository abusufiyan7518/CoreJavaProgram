package org.collection.list;

import java.util.ArrayList;

public class Arraylist_13 {
	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(10);
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		System.out.println("Values");
		System.out.println(values);

		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(60);
		values2.add(70);
		values2.add(80);
		values2.add(90);
		values2.add(100);
		values2.add(110);
		System.out.println("Values2");
		System.out.println(values2);
		System.out.println("After adding Values2");
		values.addAll(values2);
		System.out.println(values);
//		System.out.println("After removing Values2");
//		values.removeAll(values2);
//		System.out.println(values);
//		
		ArrayList<Integer> values3 = new ArrayList<Integer>();
		values3.add(1);
		System.out.println(values2.size());
		System.out.println(values3.equals(values));
		System.out.println(values.contains(values3));
		//System.out.println(values2.toArray());
		System.out.println(values3.isEmpty());

	}

}
