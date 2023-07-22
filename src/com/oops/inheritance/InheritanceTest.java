package com.oops.inheritance;

public class InheritanceTest {
	public static void main(String[] args) {

		Car car = new Car();
		car.type = "Car";
		car.model = "Tempo";
		car.maxSpeed = 70;

		car.print();

		Motorcycle motor = new Motorcycle();
		motor.type = "MoterCycle";
		motor.model = "Heropuchch";
		motor.maxSpeed = 45;

		motor.print();

	}

}
