package org.string;

public class SubStringWithExceptionHandling_7 {

	public static void main(String[] args) {
		String str = "Dilshad Hotel 90 feet road";
		String str1 = str.substring(0);
		System.out.println(str1);
		System.out.println(str.substring(14, 26));
		System.out.println("Length Of String: " + str.length());
		try {
			System.out.println(str.substring(14, 28));
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Please enter correct index number");
		}
	}

}
