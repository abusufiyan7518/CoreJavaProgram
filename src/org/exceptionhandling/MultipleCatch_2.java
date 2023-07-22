package org.exceptionhandling;

public class MultipleCatch_2 {
	public static void main(String[] args) {
		try {
			int n = 10;

			if (100 % n == 0)
				System.out.println(n + " is a factor of 100");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic " + e);
		} catch (NumberFormatException e) {
			System.out.println("Number Format Exception " + e);
		}
		System.out.println("786 is luckiest number");
	}

}
