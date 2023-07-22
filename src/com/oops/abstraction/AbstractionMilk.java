package com.oops.abstraction;

abstract class Milk {
	public abstract String pour();

	public String drink() {
		return "Drinking Milk";
	}
}

class CowMilk extends Milk {
	public String pour() {
		return "Pouring Cow Milk";
	}

	public String coffe() {
		return "Coffe is ready";
	}

	public String curd() {
		return "Curd waah";
	}
}

public class AbstractionMilk {
	public static void main(String[] args) {
		CowMilk m = new CowMilk();
		System.out.println(m.pour());
		System.out.println(m.coffe());
		System.out.println(m.curd());
		System.out.println(m.drink());
	}
}
