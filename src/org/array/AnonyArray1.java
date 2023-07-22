
package org.array;

public class AnonyArray1 {

	public static void main(String[] args) {

		AnonyArray1.sum(new int[] { 10, 20, 30 });

	}

	static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;

		}
		System.out.println("Sum of total is :" + total);

	}

}
