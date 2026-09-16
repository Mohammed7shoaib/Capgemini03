package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Taskmult0f5 {
	public static void main(String[] args) {
		List<Integer> no=Arrays.asList(10,22,50,66,99,1,0,44,100);
		no.stream().filter(num->num%5==0).forEach(System.out::println);;
	}
}
