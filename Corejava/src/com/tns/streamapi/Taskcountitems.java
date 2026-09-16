package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

class items{
	String name;
	int units;
	public items(String name, int units) {
		super();
		this.name = name;
		this.units = units;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getunits() {
		return units;
	}
	public void setunits(int units) {
		this.units = units;
	}
}

public class Taskcountitems {
	public static void main(String[] args) {
		List<items> e=Arrays.asList(new items("Headphone",9000), 
				new items("Charger",900), 
				new items("Mobilephones",12000), 
				new items("Laptops",5100),  
				new items("Earbuds",1100));
		
		List<String> s = e.stream()
				.filter(unit -> unit.getunits() > 5000)
				.map(items::getName)
				.sorted()            
				.toList();
		
		System.out.println(s);
	}
}
