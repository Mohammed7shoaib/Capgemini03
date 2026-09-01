package com.tns.ExceptionHandling;

//With Exception

public class Finallydemo {
public static void main(String[] args) {
	try {
		System.out.println(6/0);
	}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println(f);
	}
	finally {
		System.out.println("Welcome to java");
	}
	}
}
