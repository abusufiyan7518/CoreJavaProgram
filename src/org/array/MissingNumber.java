package org.array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 25, 33, 100 };
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number: " + missingNumber);
	}

	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int totalSum = (n * (n + 1)) / 2;
		int arraySum = 0;
		for (int num : arr) {
			arraySum += num;
		}

		return totalSum - arraySum;
	}
}