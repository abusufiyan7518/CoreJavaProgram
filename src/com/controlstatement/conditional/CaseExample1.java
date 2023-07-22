package com.controlstatement.conditional;

public class CaseExample1 {

	public static void main(String[] args) {
		int a = 4;
		switch (a) {
		case 1:
			System.out.println("you have 1");
			break;

		case 2:
			System.out.println("you have 2");
			break;
		case 3:
			System.out.println("you have 3");
			break;
		case 4:
			System.out.println("you have 4");
			break;
		case 5:
			System.out.println("you have 5");
			break;
		default:
			System.out.println("please insert value b/w 1 to 5");
			System.out.println(a);
			break;
		}
	}

}
