package com.oops.polymorphism;

class PUBG {
	String damageAWM() {
		return "Before Update 1 shot:-150 Health loss...";
	}
}

class PubgUpdatedVersion extends PUBG {
	String damageAWM() {
		return super.damageAWM() + "\nAfter Update 1 shot:-Enemy eliminate...";
	}
}

public class Overriding_Game {
	public static void main(String[] args) {
		PubgUpdatedVersion gun = new PubgUpdatedVersion();

		System.out.println(gun.damageAWM());
	}
}
