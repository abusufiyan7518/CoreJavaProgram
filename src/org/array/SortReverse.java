package org.array;

import java.util.Arrays;
import java.util.Collections;

public class SortReverse {

	// Note:-Wrapper class is used because the reverseOrder() method does not work
	// for the primitive data types.
	public static void main(String[] args) {
		Integer[] array = { 23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205 };
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " + Arrays.toString(array));
	}

}
