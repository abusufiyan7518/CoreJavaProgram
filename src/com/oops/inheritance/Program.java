package com.oops.inheritance;

//Multilevel Inheritance
class Person {
	String getName() {
		return "Programmer Guy's";
	}
}

class Programmer extends Person {
	String getCodingLanguage() {
		return "Java";
	}
}

public class Program extends Programmer {
	int getLineOfCode() {
		return 20;
	}

	public static void main(String[] args) {
		Program pgm = new Program();
		System.out.println("I am " + pgm.getName() + " and i learn " + pgm.getCodingLanguage() + " This Program has "
				+ pgm.getLineOfCode() + " Lines");
	}
}
