package org.exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {

		try {

			int a = 10 / 0;
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

}
