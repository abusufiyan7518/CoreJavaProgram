package org.stringbuffer;

public class StringVsStringBuffer {

	public static String concatWithString() {
		String t = "BCA";
		for (int i = 0; i < 10000; i++) {
			t = t + "Student";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("BCA");
		for (int i = 0; i < 10000; i++) {
			sb.append("Student");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
