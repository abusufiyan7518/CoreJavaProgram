package com.controlstatement.conditional;

public class EvenOddExample {

	public static void main(String[] args) {
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number:" + i);
			} else {
				System.out.println("Odd Number:" + i);
			}

		}
	}

}
