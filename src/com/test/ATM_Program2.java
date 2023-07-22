package com.test;



import java.util.Scanner;
class Atm{
	 double balance;
	int pin=1243;
	public void checkPin() {
		System.out.println("Enter your Pin");
		Scanner s=new Scanner(System.in);
		int enteredpin=s.nextInt();
		if(enteredpin==pin) {
			menu();
		}
		else {
			System.out.println("Enter a vailed Pin");
			System.out.println("Please Enter Correct Pin");
		}
	}
	public void menu() {
		System.out.println("Enter Your Choice");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw Balance");
		System.out.println("3. Deposit Balance");
		System.out.println("4. Exit");
		Scanner s= new Scanner(System.in);
		int option=s.nextInt();
		if(option==1) {
			checkbalance();
		}
		else if (option==2) {
			withdrawbalance();
			
		}
		else if (option==3) {
			depositbalance();
			
		}
		else if (option==4) {
			System.exit(1);	
		} 
		else {
			System.out.println("Enter a vaild choice");
		}
		}
	public  void checkbalance() {
	System.out.println("Balance->"+balance);
	menu();
	}
	public  void withdrawbalance() {
		System.out.println("Enter Amount to Withdraw");
		Scanner s=new Scanner(System.in);
		 float amount=s.nextFloat();
		 if(amount>balance) {
			 System.out.println("Insufficient Balance");
		 }
		 else {
			 balance=balance-amount;
			 System.out.println("Money Withdraw Successful");
			
		 }
		 menu();
	}	
	public void depositbalance() {
	System.out.println("Enter Your Balance");
	Scanner s=new Scanner(System.in);
	int amount=s.nextInt();
	System.out.println();
	balance=balance+amount;
	System.out.println("Money Deposit Seccessful\n"+""+balance);
		menu();
	}
}
public class ATM_Program2 {

	public static void main(String[] args) {
		Atm atm=new Atm();
atm.checkPin();
	}

}


