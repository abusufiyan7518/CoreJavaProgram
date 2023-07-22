package com.controlstatement.conditional;

public class ElseIf {

	public static void main(String[] args) {
int a = 40, b = 30, c = 40;
		if (a > b && a == c) {
			System.out.println("A is greater");
			if (c > a) {
				System.out.println("Nested IF");
			} else {
				System.out.println("Nested Else");
			}

		} else if (b > a && b > c) {
			System.out.println("B is greater");
		} else if (c > a && c > b) {
			System.out.println("C is greater");
		} else {
			System.out.println("Kuch to Gadbad Hai 'Daya' ");
		}
	}

}
