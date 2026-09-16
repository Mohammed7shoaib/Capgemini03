package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> n=Arrays.asList(55,45,78,94,86,72,101);
		n.stream().sorted().forEach(number->{System.out.println(number);
			});
		}
}
