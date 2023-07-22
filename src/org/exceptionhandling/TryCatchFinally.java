package org.exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int[] Numbers = { 1, 2, 3 };
			System.out.println(Numbers[10]);
		} catch (Exception e) {
			System.out.println("Daya kuch to gadbad hai.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}

	}

}
