package com.oops.encapsulation;

import java.util.Scanner;

class NegativeAgeFoundException extends RuntimeException {
	public NegativeAgeFoundException(String message) {
		super(message);
	}
}

class ValidationForVote {
	private int age;

	public void validationFor(int age) {
		if (age < 0) {
			throw new NegativeAgeFoundException("Negative age....");
		} else if (age <= 18) {
			System.out.println("Not eligible for Vote...");
		} else {
			System.out.println("Eligible for Vote...");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}
}

public class EncapVotingValidation {
	public static void main(String[] args) throws NegativeAgeFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		ValidationForVote v = new ValidationForVote();
		v.setAge(age);
		v.validationFor(v.getAge());
	}
}
