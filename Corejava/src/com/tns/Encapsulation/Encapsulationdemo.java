package com.tns.Encapsulation;

import java.util.Scanner;

	//Demo for encapsulation

class BankAccount{
	
	//private data members
	
	private String Accountholder;
	private double balance;
	
	//Parameter
	
public BankAccount(String accountholder,double balance){
	super();
	Accountholder=accountholder;
	this.balance=balance;
}
	//getter and setter

public String getAccountholder() {
	return Accountholder;
}

public void setAccountholder(String accountholder) {
	Accountholder = accountholder;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

	//Deposit method

public void deposit(double amount) {
	if(amount>0) {
		balance=balance+amount;
		System.out.println("amount deposit successfully");
	}
	else {
		System.out.println("invalid amount");
	}
}
	//Withdraw method
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdrawn successfully");
		}
		else {
			System.out.println("invalid amount or insufficient");
		}
	}
	public void display() {
		System.out.println("accountholder"+Accountholder);
		System.out.println("Balance"+balance);
	}
}

public class Encapsulationdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter account holder name:");
	String name=sc.nextLine();

	System.out.println("enter initial balance :");	
	double balance=sc.nextInt();
	
	BankAccount b=new BankAccount(name,balance);

	b.display();
	
	System.out.println("enter amount to deposit");
	double depositamount=sc.nextDouble();
	b.deposit(depositamount);
	
	System.out.println("enter amount to withdraw");
	double withdraw=sc.nextDouble();
	b.withdraw(withdraw);
	
	System.out.println("finalamount"+b.getBalance());
	sc.close();

	
}
}
