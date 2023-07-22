package org.exceptionhandling;

public class NestedTry {
	public static void main(String args[]) {

		try {

			int a2 = 10 / 0;
			System.out.println(a2);

			try {
				int b = 39 / 0;
			}

			catch (ArithmeticException e) {
				System.out.println("First Inner Catch Block" + e);
			}
			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Second inner catch block :" + e);
			}

			System.out.println("other statement");
		}

		catch (Exception e) {
			System.out.println("handled the exception (outer catch)" + e);
		}
		System.out.println("normal flow..");
	}
}
