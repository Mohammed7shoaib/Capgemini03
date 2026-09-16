package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

// distinct (remove the duplicate values)

public class Test4 {
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(99,80,45,64,58,105,22,24,39,22,75);
		long count=a.stream().distinct().count();
		System.out.println("Unique values :"+count);
				}
}
