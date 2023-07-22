package com.controlstatement.looping;

public class DuplicateValue_14 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 10, 15, 17, 21 };
		int[] b = { 1, 4, 8, 15, 21, 33, 34 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				} else {
					System.out.println("Not Duplicate Found");
				}
			}
		}
	}

}
