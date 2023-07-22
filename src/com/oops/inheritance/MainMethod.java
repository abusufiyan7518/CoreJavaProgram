package com.oops.inheritance;

 public class MainMethod extends Demo2 {
	 void m2() {
		 System.out.println("Byy");
	 }
		public static void main(String[] args) {
			MainMethod mainMethod=new MainMethod();
			mainMethod.m1();
			mainMethod.m2();
	}
}
class Demo2{
	void m1() {
		System.err.println("hey");
	}
}