package org.exceptionhandling;

public class MultipleTryCatch {
	public static void main(String[] args) {

		try {
			String s1 = null;
			System.out.println(s1.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs" + e);
		}
		System.out.println("rest of the code");
	}
}
