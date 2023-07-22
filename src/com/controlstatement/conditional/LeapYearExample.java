package com.controlstatement.conditional;

public class LeapYearExample {

	public static void main(String[] args) {
int year =2008;
if((year%400==0)||(year%4==0&&year%1002!=0)) {
	System.out.println("LEAP YEAR");
}
else {
	System.out.println("NOT LEAP YEAR");
}
	}

}
