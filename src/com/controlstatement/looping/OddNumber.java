package com.controlstatement.looping;

public class OddNumber {

	public static void main(String[] args) {
		int num = 100;
		for (int i = 0; i <= num; i++) {
			// System.out.println("odd number b/w 1 to "+100);

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
