package com.tns.Abstraction;

//Demo for abstraction


abstract class Delivery{ // abstract class

	abstract double calculateCharge(double distance);  // abstract method

	void showDeliveryType() {
	System.out.println("delivery service selected");
	}
}

class BikeDelivery extends Delivery{
	
	@Override
	double calculateCharge(double distance) {
		return distance*10;
	}

}

class DroneDelivery extends Delivery{
	
	@Override
	double calculateCharge(double distance) {
		return distance*20;
	}
}

public class Abstrationdemo {
	public static void main(String[] args) {
		
	
		BikeDelivery b =new BikeDelivery();
		System.out.println("BikeCharge :"+b.calculateCharge(15));
		
		DroneDelivery d =new DroneDelivery();
		System.out.println("DroneCharge :"+d.calculateCharge(10));
	}
}

