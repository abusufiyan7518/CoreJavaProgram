package com.oops.abstraction;

interface A {
	void m1();

	int a = 10;
	int b = 20;
	int c = a + b;
}

interface B {
	void m2();
}

class Interface implements A, B {
	public void m1() {
		System.out.println(c);
	}

	public void m2() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Interface e = new Interface();
		e.m1();
		e.m2();
	}
}
