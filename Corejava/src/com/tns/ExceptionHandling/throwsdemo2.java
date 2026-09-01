package com.tns.ExceptionHandling;

public class throwsdemo2 {
static void Login(String username,String password) throws Exception{
	if(username.equals("admin")) {
		throw new Exception("Invalid username");
	}
	if(!password.equals("1234")) {
		throw new Exception("Invalid password");
	}
	System.out.println("login successful");
	}
	public static void main(String[] args) {
		try {
			Login("admin","111");
		}
		catch(Exception s) {
			System.out.println(s.getMessage());
		}
		System.out.println("Login process completed");
	}
}
