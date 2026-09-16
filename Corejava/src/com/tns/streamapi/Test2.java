package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

//map()+tolist()

public class Test2 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Manoj","Rehan","Shabu","Shoaib");
		List<String> uppernames=names.stream().map(name->name.toUpperCase()).toList();
		System.out.println("all converted :"+uppernames);
	}
}
