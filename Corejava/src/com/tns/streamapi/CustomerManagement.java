package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	
	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class CustomerManagement {
	public static void main(String[] args) {
		List<Customer> c=Arrays.asList(new Customer ("Shoaib","Tumkur"),
				new Customer ("Manoj","Banglore"),
				new Customer ("Rehan","Gubbi"),
				new Customer ("Shabu","Tumkur"),
				new Customer ("Dileep","Banglore"),
				new Customer ("Chetan","Banglore"),
				new Customer ("Dhanush","Manglore"),
				new Customer ("Varun","Banglore"));
		c.stream().filter(c1->c1.getCity().equals("Banglore")).forEach(c1->System.out.println(c1.getName()+""+c1.getCity()));
		
	}
}
