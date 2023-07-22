package com.controlstatement.conditional;

public class Iterating_10 {

	public static void main(String[] args) {
		String str = "Hindustan";
		String saki = "India";
		if (str == saki) {
			System.out.println("Same");
		} else if (str != saki) {
			System.out.println("Not Equal");
		} else {
			System.out.println("Not Same");
		}

		int age = 17;
		int weight = 45;
		if (age >= 18) {
			if (weight >= 40) {
				System.out.println("age is:" + age + " & weight is:" + weight);
			} else if (age < 18) {
				System.out.println("");
			} else if (weight < 40) {
				System.out.println("under weight");
			}
		} else {
			System.out.println("oops...under age");
		}
	}
}
