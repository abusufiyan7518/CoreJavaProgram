package org.string;

public class Concat1 {

	public static void main(String[] args) {
		String str1 = "Lucky ";
		String str2 = "Chhora";
		String str3 = "Shadan ";
		String str4 = "Khan ";
		String str5 = "Munna";
		String str6 = "Bhai";
		String str7 = "Aadil";
		String str8 = "Noor";
		String str9 = "Bhaiya";
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str4));
		System.out.println(str3.concat(str4));
		System.out.println(str4.concat(str1));
		System.out.println(str5.concat(str6));
		System.out.println(str7.concat(str8));
		System.out.println(str1.concat(str6));
		System.out.println(str4.concat(str5));
		System.out.println(str3.concat(str6));
		System.out.println(str5.concat(str9));
	}
}
