package org.exceptionhandling;

public class CheckingFinally {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println("Try Block");
			System.exit(1);

		} catch (ArrayIndexOutOfBoundsException I) {
			System.out.println(I);
			System.out.println("Out Of Bounds Catch");
			System.exit(1);
		} catch (ArithmeticException Ar) {
			System.out.println(Ar);
			System.out.println("Arithmetic Catch");
			System.exit(1);
		} catch (NullPointerException Null) {
			System.out.println(Null);
			System.out.println("Null Catch");
			System.exit(1);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Catch");
			System.exit(1);
		} finally {
			System.out.println("Finally");
		}
	}

}
