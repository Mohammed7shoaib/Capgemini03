package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test6 {
	public static void main(String[] args) {
		List<String> p1=Arrays.asList("apple","banana","mango","orange","papaya","strawberry");
		Optional <String> r=p1.stream().skip(3).findFirst();
		System.out.println(r.orElse("product not found"));
	}
}
