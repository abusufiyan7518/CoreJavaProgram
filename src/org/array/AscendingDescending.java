package org.array;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {

	public static void main(String[] args) {
		Integer[] arr = { 44, 5, 24, 15, 4, 3, -25, -7 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
