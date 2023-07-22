package com.oops.inheritance;

//Multilevel inheritance
class iPhone6 {
	void makeCalls() {
		System.out.println("calling function.....");
	}
}

class iPhone10 extends iPhone6 {
	void UnlockByFaceId() {
		System.out.println("unlocking phone by face id.....");
	}
}

public class iPhone12 extends iPhone10 {
	void supportfor5GNetwork() {
		System.out.println("5G Network.....");
	}

	public static void main(String[] args) {
		iPhone12 iPhone = new iPhone12();
		iPhone.makeCalls();
		iPhone.UnlockByFaceId();
		iPhone.UnlockByFaceId();
	}

}
