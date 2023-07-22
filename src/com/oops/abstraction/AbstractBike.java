package com.oops.abstraction;

abstract class MotorBike {
	abstract String brake();
}

class SportsBike extends MotorBike {
	public String brake() {
		return "Ninja Zx10R";
	}
}

class SimpleBike extends MotorBike {
	public String brake() {

		return "HeroPucchh";
	}
}

public class AbstractBike {
	public static void main(String[] args) {
		MotorBike bike = new SimpleBike();
		System.out.println(bike.brake());
		MotorBike sb = new SportsBike();
		System.out.println(sb.brake());
	}
}
