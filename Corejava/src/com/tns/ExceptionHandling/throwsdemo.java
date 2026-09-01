package com.tns.ExceptionHandling;

public class throwsdemo {
static void calculate(int a,int b) throws ArithmeticException{ 
	int result=a/b;
	System.out.println("Result :"+result);
	}
	public static void main(String[] args) {
		try {
			calculate (10,0);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
	}
}
