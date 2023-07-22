package org.array;

public class ThreeDArray {

	public static void main(String[] args) {
		int[][][] a = { { { 10, 20 }, { 30, 40, 50 }, { 60, 70, 80, 90 } } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.println(a[i][j][k]);
				}
				System.out.println();

			}
		}
		System.out.println("length of   0   " + a[0].length);
//System.out.println("length of 1:"+a[0][0][1].length);
//	System.out.println("length of 2:"+a[2].length);
		System.out.println("length of 0,0:  " + a[0][0].length);
		System.out.println("length of 0,1:  " + a[0][1].length);
		System.out.println("length of 0,2:  " + a[0][2].length);

	}

}
