package com.controlstatement.conditional;

public class IfElseIfexample {

	public static void main(String[] args) {
		String city = "Saki Naka";

		if (city == "Kurla") {
			System.out.println("Kurla");
		} else if (city == "Kalamboli") {
			System.out.println("Kalamboli");
		} else if (city == "Dahisar") {
			System.out.println("Dahisar");
		} else if (city == "Saki naka") {
			System.out.println("Saki naka");
		} else {
			System.out.println(city);
		}

	}

}
