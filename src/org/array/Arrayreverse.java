package org.array;

import java.util.Iterator;

public class Arrayreverse {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.println(a[j]);
		}
	}

}
