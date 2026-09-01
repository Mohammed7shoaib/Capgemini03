package com.tns.ExceptionHandling;

public class NullExcepdemo2 {
public static void main(String[] args) {
	String employeename="Shoaib";
	String department=null;
	String designation="Software Developer";
	
	try {
		System.out.println("Employee :"+employeename);
		System.out.println("Designation :"+designation);
		System.out.println("Department :"+department.toUpperCase());
	}
	catch(NullPointerException p) {
		System.out.println("Department information is missing......");
		System.out.println(p);
	}
	System.out.println("Continuee......");
}
}
