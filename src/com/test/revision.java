package com.test;

import java.util.Scanner;
import java.util.Random;

public class revision {

	public static void main(String args[]) {
		System.out.println("Assalam alaikum  Janaab!");
		int age = 18;
		int day = 0, month = 0, year = 0;
		final int myNumber = 7;
		float sampleFloat = 0.0f;
		double sampleDouble = 0.0;

		char you = 'u';
		boolean validYear = false, validName = false;
		String name = "Lucky";
		String firstName = "", lastName = "";
		Scanner scan = new Scanner(System.in);
		while (!validName) {
			System.out.println("What's your full name?");

			name = scan.nextLine();

			if (name.indexOf(' ') == -1) {
				validName = false;
				System.out.print("Oops! Looks like you forgot to enter your full name... ");

			} else {

				validName = true;

			}

		}

		int spaceIndex = name.indexOf(' ');
		firstName = name.substring(0, spaceIndex);
		lastName = name.substring(spaceIndex + 1);

		name = name.toLowerCase();

		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

		System.out.println("\nHello there " + firstName + "! I hope to help you revise some Java...");

		System.out.println("\nHere are some interesting facts about your name:");

		System.out.println("* Your first name: " + firstName);
		System.out.println("* Your last name: " + lastName);

		System.out.println("* Your name is " + name.length() + " characters long.");

		if (firstName.equals(lastName))
			System.out.println("* Your first name and last name is the same!");

		char vowels[] = new char[5];
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';

		char vowelsCaps[] = { 'A', 'E', 'I', 'O', 'U' };

		int vowelsCount = 0;
		String highlightedName = name;

		for (int letter = 0; letter < name.length(); letter++) {

			for (int i = 0; i < vowels.length; i++) {

				if (name.charAt(letter) == vowels[i]) {
					++vowelsCount;
					highlightedName = highlightedName.replace(vowels[i], vowelsCaps[i]);

				}

			}

		}

		System.out.println("* Your name has " + vowelsCount + " vowels (" + highlightedName + ").");

		boolean palindrome = true;

		String nameUpper = firstName.toUpperCase();

		for (int count = 0; count < nameUpper.length(); count++) {

			if (nameUpper.charAt(count) != nameUpper.charAt(nameUpper.length() - 1 - count)) {

				palindrome = false;

				break;
			}
		}

		if (palindrome) {
			System.out.println("* Your first name is palindromic (reads the same backwards as forwards)!");
		} else {
			System.out.println("* Your first name is not palindromic.");
		}
		while (month == 0) {
			System.out.print("\nName the month were you born in: ");
			String monthName = scan.nextLine();

			monthName = monthName.toLowerCase();
			switch (monthName) {
			case "january":
				month = 1;
				break;
			case "february":
				month = 2;
				break;
			case "march":
				month = 3;
				break;
			case "april":
				month = 4;
				break;
			case "may":
				month = 5;
				break;
			case "june":
				month = 6;
				break;
			case "july":
				month = 7;
				break;
			case "august":
				month = 8;
				break;
			case "september":
				month = 9;
				break;
			case "october":
				month = 10;
				break;
			case "november":
				month = 11;
				break;
			case "december":
				month = 12;
				break;
			default:
				month = 0;
				break;
			}
			if (month == 0)
				System.out.println("Emmm... that doesn't look like a valid month...");
		}
		int count = 0;
		do {
			if (count > 0) {
				System.out.println("\nEmmm... That doesn't look like a year you could be born in! ");
				System.out.println("Try a year between 1930 and 2023... ");
			}
			System.out.println("What year were you born in?");
			year = scan.nextInt();

			validYear = (year >= 1930 && year < 2024) ? true : false;
			count++;
		} while (!validYear);
		System.out.println("\nSome intersting facts about your birthday:");
		if (month == 1) {
			System.out.println("* You were born on the 1st month.");
		} else if (month == 2) {
			System.out.println("* You were born on the 2nd month.");
		} else if (month == 3) {
			System.out.println("* You were born on the 3rd month.");
		} else {
			System.out.println("* You were born on the " + month + "th month.");
		}
		age = 2023 - year;
		System.out.println("* You are " + age + " years old.");
		System.out.println("* You are " + (age * 12) + " months old.");
		System.out.println("* You are around " + (age * 52) + " weeks old.");
		System.out.println("* You are approximately " + (age * 365) + " days old.");
		System.out.println("* You are over " + (age * 365 * 24) + " hours old.");
		System.out.println("* You are over " + (age * 365 * 1440) + "minutes old.");// lucky chhora
		System.out.println("* You are over " + (age * 365 * 86400) + "");

		if (age % 2 == 0) {
			System.out.println("* Your age is an even number.");
		} else {
			System.out.println("* Your age is an odd number.");
		}
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("* The year " + year + " is a leap year!");
		} else {
			System.out.println("* You were not born on a leap year.");
		}
		Random randomNumber = new Random();
		int luckyNumber = randomNumber.nextInt(12);
		int onesDigit = year % 10;
		int tensDigit = year / 10 % 10;
		int hundredsDigit = year / 100 % 10;
		int thousandsDigit = year / 1000 % 10;
		double powerDigit = Math.pow(thousandsDigit, 4);
		int result = onesDigit - hundredsDigit + tensDigit;
		luckyNumber += result;

		System.out.println("* Your lucky number is: " + luckyNumber);

		int luckyDates[] = new int[3];

		for (int i = 0; i < luckyDates.length; i++) {

			int randomDate = randomNumber.nextInt(30) + 1;

			luckyDates[i] = randomDate;
		}

		System.out.print("* Your lucky dates are: ");

		for (int i = 0; i < luckyDates.length; i++) {

			if (i == luckyDates.length - 1) {

				System.out.print("& " + luckyDates[i] + ". \n\n");
			} else {

				System.out.print(luckyDates[i] + ", ");
			}
		}

	}
}