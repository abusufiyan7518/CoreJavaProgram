package com.oops.encapsulation;

import com.oops.inheritance.Employee;

public class Student extends Employee {
	protected void m1() {

		System.out.println("Student");

	}

	public static void main(String[] args) {
		Student std = new Student();
		std.m1();
	}

}
