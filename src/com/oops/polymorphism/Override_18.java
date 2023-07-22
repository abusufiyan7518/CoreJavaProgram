package com.oops.polymorphism;

class shape {
	void draw1() {
		System.out.println("Shape");
	}
}

class Rectangle extends shape {
	void draw1() {
		super.draw1();
		System.out.println("Rectangle");
	}
}

public class Override_18 {
	public static void main(String[] args) {
		shape s = new Rectangle();
		s.draw1();
	}

}
