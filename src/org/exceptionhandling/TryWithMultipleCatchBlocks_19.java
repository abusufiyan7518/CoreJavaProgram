package org.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithMultipleCatchBlocks_19 {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println(arr);
		} catch (NoSuchFieldError ns) {
			System.out.println(ns);
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (NumberFormatException nf) {
			System.out.println(nf);
		} catch (StringIndexOutOfBoundsException si) {
			System.out.println(si);
		} catch (IllegalArgumentException ia) {
			System.out.println(ia);
		} catch (IllegalStateException is) {
			System.out.println(is);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (RuntimeException re) {
			System.out.println(re);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
