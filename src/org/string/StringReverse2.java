package org.string;

public class StringReverse2 {
	public static void main(String[] args) {
		String str = "Lucky";

		char[] charr = str.toCharArray();
		for (int i = charr.length - 1; i >= 0; i--) {
			System.out.println(charr[i]);
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

		StringBuffer s = new StringBuffer(str);
		System.out.println(s.reverse());

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}
