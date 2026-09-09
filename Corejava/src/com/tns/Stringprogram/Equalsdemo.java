package com.tns.Stringprogram;

public class Equalsdemo {
	public static void main(String[] args) {
		String s1="Manoj";
		String s2=new String("Manoj");
		String s3="Manoj";
		String s4="Sneha";
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		
	}
}
