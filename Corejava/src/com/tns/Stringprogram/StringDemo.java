package com.tns.Stringprogram;

public class StringDemo {
	public static void main(String[] args) {
		
		String s="Hello,I am Shoaib";
		
		System.out.println("length :"+s.length());
		
		System.out.println("Character at the index 6:"+s.charAt(6));
		
		System.out.println("Uppercase :"+s.toUpperCase());
		System.out.println("Lowercase :"+s.toLowerCase());
		
		System.out.println(s.contains("am"));
		
		System.out.println(s.startsWith("Hello"));
		
		System.out.println(s.endsWith("Shoaib"));
		
		System.out.println(s.substring(6, 10));
		
		System.out.println(s.replace("Shoaib", "Dileep"));

	}
}
