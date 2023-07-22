package com.oops.abstraction;

public class ConcreteClassExample {
	void show() {
		System.out.println(" Show");
	}

	void display() {
		System.out.println("Display");
	}

	public static void main(String[] args) {
		ConcreteClassExample classExample = new ConcreteClassExample();
		classExample.show();
		classExample.display();
	}
}
