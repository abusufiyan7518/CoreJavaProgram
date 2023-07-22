package org.exceptionhandling;

public class Finally_3 {
	public static void main(String[] args) {

		try {
			int a = 5 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally block is always executed");
		}

	}
}
