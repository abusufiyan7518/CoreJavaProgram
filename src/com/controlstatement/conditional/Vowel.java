package com.controlstatement.conditional;

public class Vowel {

	public static void main(String[] args) {

		char ch = 'O';
		switch (ch) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;
		default:
			System.out.println(ch);
			break;
		}

		/*
		 * String levelString = "Expert"; int level = 3;
		 * 
		 * switch (levelString) { case "Beginner": level = 1; break; case
		 * "Intermediate": level = 2; break; case "Expert": level = 3; break; default:
		 * level = 0; System.out.println("Lucky"); break; }
		 * System.out.println("Your Level is: " + level);
		 */
	}
}