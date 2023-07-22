package com.test;

public class OneMethodCallMultipleTimes {
	void show(int... a) {
		for (int i : a) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		OneMethodCallMultipleTimes ob = new OneMethodCallMultipleTimes();
		ob.show();
		ob.show(1, 2);
		ob.show(5, 4, 5, 6);
		ob.show(3, 4, 5);
	}
}
