package com.controlstatement.looping;

public class PallindromeExample {
	public static void main(String args[]) {
		int sum = 0, temp;
		int n = 232;
		temp = n;
		while (n > 0) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
