package com.oops.inheritance;
//overriding Hierachical
class Human {
	String job() {
		return "Working Puropose";

	}
}

class Madam extends Human {
	String job() {
		return "Teaches the Students";
	}
}

class Doctor extends Human {
	String job() {
		return "Treatment of Pateint's";
	}
}

class Lawyer extends Human {
	String job() {
		return "Protecting a Client";
	}
}

public class Main2 {
	public static void main(String[] args) {
		Human h = new Human();
		Madam tch = new Madam();
		Doctor dr = new Doctor();
		Lawyer lwr = new Lawyer();
		System.out.println(h.job());
		System.out.println(tch.job());
		System.out.println(dr.job());
		System.out.println(lwr.job());
	}

}
