package com.tns.Polymorphisim;


// Demo for method over riding

class Bankaccount{
	void calculateInterest(double amount) {
		System.out.println("Calculating standard bank Interest");
		System.out.println("Amount :"+amount);
	}
}

class Savingaccount extends Bankaccount{
	@Override
	void calculateInterest(double amount) {
	    double interest = amount * 0.04;
	    System.out.println("Savingaccount");
	    System.out.println("principal :" + amount);
	    System.out.println("Interest :" + interest); 
	}
}
class Fixeddeposit extends Bankaccount{
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.07;
		System.out.println("Fixeddeposit");
		System.out.println("principal :"+amount);
		System.out.println("Interest :"+interest);
	}
}

class Currentaccount extends Bankaccount{
	@Override
	void calculateInterest(double amount) {
		System.out.println("currentaccount");
		System.out.println("no interest provided");
	}
}

public class MethodOverriding {
public static void main(String[] args) {
	
	Bankaccount a;
	a=new Savingaccount();
	a.calculateInterest(100000);
	System.out.println();

	a=new Fixeddeposit();
	a.calculateInterest(100000);
	System.out.println();
	
	a=new Currentaccount();
	a.calculateInterest(100000);
	
}
}
