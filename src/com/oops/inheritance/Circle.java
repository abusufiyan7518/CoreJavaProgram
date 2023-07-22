package com.oops.inheritance;
//Single Inheritance
class Shape1 {
	void draw() {
		System.out.println("Shape");
	}
}

public class Circle extends Shape1 {
	void draw1() {
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		Circle r = new Circle();
		r.draw();
		r.draw1();
	}

}
