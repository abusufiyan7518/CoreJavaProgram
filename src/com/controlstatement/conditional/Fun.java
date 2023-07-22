package com.controlstatement.conditional;

public class Fun {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			if (i == 5) {
				i++;
				System.out.println("After Itterate :" + i);
				// continue;
				break;
			} else {
				System.out.println(i);
			}
			int str = i;
			System.out.println("Value of str" + str);
		}
	}
}
