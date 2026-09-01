package com.tns.ExceptionHandling;

public class ArrayIndexdemo {
public static void main(String[] args) {
	int marks[]= {20,30,50,90};
	try {
		System.out.println(marks[3]);
		System.out.println(marks[2]);
		System.out.println(marks[1]);
		System.out.println(marks[7]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a);
	}
	System.out.println("Countdown Starts......");
}
}
