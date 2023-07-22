package org.exceptionhandling;

public class Finally_4 {
	public static void main(String[] args) {
		try {

			int data = 25 / 0;
			System.out.println(data);
		}

		catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArithmeticException b) {
			System.out.println(b);
		} catch (IndexOutOfBoundsException c) {
			System.out.println(c);
		} finally {
			System.out.println("finally block is always executed");
		}

		System.out.println("...");

	}

}
