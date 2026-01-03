package com.cabbygo;

public class Vehicle {
	String name;
	protected String vehicleNumeber;
	Vehicle(String vehicleNumber, String name){
		this.vehicleNumeber  = vehicleNumber;
		this.name  =  name;
	}
	public void calculateFare(User u) {
		System.out.println("Total Fare");
	}
}