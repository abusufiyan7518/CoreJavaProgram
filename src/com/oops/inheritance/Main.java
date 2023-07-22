package com.oops.inheritance;

//Hierarchical Inheritance
class School {
	void SchoolName() {
		System.out.println("ARC PG COLLEGE");
	}
}

class Teacher extends School {
	void teach() {
		System.out.println("Teacher teaches JAVA");
	}
}

class Student1 extends School {
	String classStudying() {
		//System.out.println("Student in BCA");
		return "Student in BCA";
	}
}

public class Main {
	public static void main(String[] args) {
		Teacher tc = new Teacher();
		tc.SchoolName();
		tc.teach();
		Student1 std = new Student1();
		std.SchoolName();
		System.out.println(std.classStudying());
	}

}