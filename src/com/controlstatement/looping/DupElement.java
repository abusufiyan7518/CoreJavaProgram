package com.controlstatement.looping;

public class DupElement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 885 };
		int[] b = { 1, 3, 5, 885 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}

		}
	}

}
