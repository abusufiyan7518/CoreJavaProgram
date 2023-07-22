package com.controlstatement.conditional;

public class WrapperInSwitch {

	public static void main(String[] args) {
		Integer age = 18;
		switch (age) {
		case 15:
			System.out.println("age is less than 18+");
			break;
		case 16:
			System.out.println("age is also less than 18+");
			break;
		case 17:
			System.out.println("age is less than 18+");
			break;
		case 18:
			System.out.println("age is equal to 18");
			break;
		case 19:
			System.out.println("age is greater than 18+");
		default:
			System.out.println();
		}
	}

}
