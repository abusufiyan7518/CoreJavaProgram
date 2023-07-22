package org.array;

public class MissingNumberArray1 {

	public static void main(String[] args) {
//int[] a= {1,2,4,5,6,7,8};
//int[] a= {2,4,8,10};
		int[] a = { 1, 3, 7, 9, 11 };

		int n = a.length + 1;
//int b=(n*(n+1)/2);used for missing no..
//int b=(n*(n+1));used for even no..
		int b = (n * (n));// used for odd no;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		int missing = b - sum;
		System.out.println(missing);
	}

}
