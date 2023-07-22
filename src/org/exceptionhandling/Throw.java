package org.exceptionhandling;

class UserDefinedException extends Exception {

	public UserDefinedException(String str) {
		super(str);
	}
}

public class Throw {
	public static void main(String args[]) {
		try {

			throw new UserDefinedException("This is user-defined exception");

		} catch (UserDefinedException e) {
			System.out.println("Caught the " + e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}