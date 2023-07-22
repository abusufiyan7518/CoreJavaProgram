package com.oops.abstraction;

abstract class Bank {
	abstract int getInterestRate();
}

class AxisBank extends Bank {
	int getInterestRate() {
		return 7;
	}
}

class SwissBank extends Bank {
	int getInterestRate() {
		return 4;
	}
}

public class AbstractBank {
	public static void main(String[] args) {
		Bank b;
		b = new AxisBank();
		System.out.println("Axis Rate Interest:" + b.getInterestRate() + "%");
		b = new SwissBank();
		System.out.println("Swiss RateInterest:" + b.getInterestRate() + "%");
		/*
		 * Bank sb = new SwissBank(); System.out.println("Interest of SwissBank:" +
		 * sb.getInterestRate() + "%"); Bank ab = new AxisBank();
		 * System.out.println("Interest of AxisBank:" + ab.getInterestRate() + "%");
		 */
	}

}
