package com.controlstatement.conditional;

public class ElseIf1 {

	public static void main(String[] args) {
		int a = 25;
		int b = 25;
		if (a > b) {
			System.out.println("a is greater");
		} else if (b > a) {
			System.out.println("b is greater");
		} else {
			System.out.println("Both are equal ");// +"a:"+a+" "+"b:"+b);
		}
	}
}
