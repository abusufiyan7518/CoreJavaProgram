package com.controlstatement.conditional;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scanner.nextInt();
		System.out.println("Enter percentage");
		int percentage = scanner.nextInt();

		if (age >= 18 && age <= 21 && percentage >= 75) {

			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}
		scanner.close();
	}
}
