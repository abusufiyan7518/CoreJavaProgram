package org.exceptionhandling;

import java.util.Iterator;

public class Throws {

//	public static void main(String[] args) throws InterruptedException {
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//	}
//
//}
/////// OR//////

	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 10; i++) {

				System.out.println(i);
				Thread.sleep(100);

			}
			int a = 3, b = 0, c = a / b;
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
