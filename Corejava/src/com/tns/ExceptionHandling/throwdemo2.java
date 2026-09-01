package com.tns.ExceptionHandling;

public class throwdemo2 {
static void checkpassword(String password) {
	if(password.length()<6) {
		throw new IllegalArgumentException("password is too short");
	}
	System.out.println("password accepted");
	}
	public static void main(String[] args) {
		try {
			checkpassword("abcdefg");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}
