package com.tns.ExceptionHandling;

public class throwdemo {
static void CheckAge(int age) {
	if (age<18) {
		throw new ArithmeticException("Student is not eligible for vote");
	}
	System.out.println("Student is eligible for vote");
	}
	public static void main(String[] args) {
		try {
			CheckAge(21);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
