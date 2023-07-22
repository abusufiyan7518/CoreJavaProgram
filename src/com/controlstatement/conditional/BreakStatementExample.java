package com.controlstatement.conditional;

public class BreakStatementExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {

				break;
			}
			System.out.println(i);
		}

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {

					break;
				}
				System.out.println(i + " " + j);
			}
		}
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {

					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
		int i = 1;
		while (i <= 10) {
			if (i == 5) {

				i++;
				break;
			}
			System.out.println(i);
			i++;
		}

		int i1 = 1;

		do {
			if (i1 == 5) {

				i1++;
				break;
			}
			System.out.println(i1);
			i1++;
		} while (i1 <= 10);
	}

}
