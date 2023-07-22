package org.array;

public class MatrixArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 3 }, { 8, 8, 5 }, { 7, 8, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

}
