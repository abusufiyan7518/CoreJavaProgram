package org.exceptionhandling;
//Java 7 Feature
public class SingleCatchMultipleExceptions {
	public static void main(String[] args) {
		try {

			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);

			int[] arr;
			arr = new int[4];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
			arr[5] = 60;
			arr[6] = 70;
			System.out.println(arr[5]);

		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
