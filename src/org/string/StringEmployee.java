package org.string;

final class Employee {

	String pancardNumber = "ASDFH2342Q";

	public Employee(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}

public class StringEmployee {
	public static void main(String ar[]) {
		Employee e = new Employee("EOOPA8063M");
		String s = e.getPancardNumber();

		System.out.println("Pancard Number: " + s);
	}
}
