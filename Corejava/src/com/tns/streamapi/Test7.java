package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test7 {
	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(3000,4000,50000,8000,90000,120000,150000,250000);
		boolean r=s.stream().filter(salary->salary>10000).anyMatch(salary->salary>100000);
		System.out.println("salary found :"+r);
	}
}
