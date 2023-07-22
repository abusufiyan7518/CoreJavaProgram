package org.string;

public class ConcatOperator_4 {

	public static void main(String[] args) {
		String str = 10 + 10 + " June " + 20 + 22;
		String str1 = " Day:'Tuesday' ";
		System.out.println(str);
		System.out.println(str.concat(str1));
	}

}
