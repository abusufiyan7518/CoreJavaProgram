package org.exceptionhandling;

public class TryCatch_4 {

	public static void main(String[] args) {
		try {
			int[] Numbers = { 1, 2, 3 };
			System.out.println(Numbers[10]);
		}

		catch (Exception e) {
			System.out.println(e);
			System.out.println("Something went wrong.");
		}

	}

}
