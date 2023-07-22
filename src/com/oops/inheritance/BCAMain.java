package com.oops.inheritance;

class BCA_Admission {
	int coachingFee() {
		return 20000;
	}
}

class Java extends BCA_Admission {
	int coachingFee() {
		return 1000;
	}
}

class Python extends BCA_Admission {
	int coachingFee() {
		super.coachingFee();
		return 800;

	}
}

public class BCAMain {
	public static void main(String[] args) {
		BCA_Admission b = new BCA_Admission();
		BCA_Admission j = new Java();
		BCA_Admission p = new Python();

		System.out.println("Fees for Java per year:Rs " + b.coachingFee());
		System.out.println("Fees for Java per month:Rs " + j.coachingFee());
		System.out.println("Fees for Java per month:Rs " + p.coachingFee());

	}

}
