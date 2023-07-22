package org.array;

import java.util.Arrays;

public class Sort885 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 44, 57, 62, -5, -1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// Without using Method of Sorting Lucky//
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);
		}

	}

}
